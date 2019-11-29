import {DateDemand} from '../../interfaces/date-demand';
import {Component, OnInit, NgZone} from '@angular/core';
import {OrderServiceService} from '../../services/order-service.service';
import {catchError, tap} from 'rxjs/operators';
import {Observable} from 'rxjs';
import {Order} from '../../interfaces/order';
import * as jwt_decode from 'jwt-decode';

@Component({
  selector: 'app-add-order',
  templateUrl: './add-order.component.html',
  styleUrls: ['./add-order.component.css']
})
export class AddOrderComponent implements OnInit {
  //retailerId will depend on saved cookie

  retailerEmail: string = "";
  success: boolean = false;
  //property which indicates whether a given slot can be picked
  slotValid = {"slot1": true, "slot2": true, "slot3": true};
  slotJson: DateDemand = {
    "date": "",
    "timeSlot1": {
      "slot": "11:00-13:00",
      "volume": undefined
    },
    "timeSlot2": {
      "slot": "14:00-16:00",
      "volume": undefined
    },
    "timeSlot3": {
      "slot": "17:00-19:00",
      "volume": undefined
    }
  };

  slot1: boolean = false;
  slot2: boolean = false;
  slot3: boolean = false;

  orderVolume: number = 5;

  selectedSlot: string;
  date = new Date(Date.now());
  today = new Date(this.date.getTime() - (this.date.getTimezoneOffset() * 60000)).toISOString().split("T")[0];

  savedOrder: Order[];

  constructor(private orderService: OrderServiceService, private zone: NgZone) {
  }

  ngOnInit() {
    // getting email from token
    var decoded = {
      "sub": ""
    }
    let token = localStorage.getItem('token');

    if (token != null) {
      decoded = jwt_decode(token);
      this.retailerEmail = decoded.sub;
    }
  }

  checkSlotsOnDate(deliveryDate) {
    this.orderService.checkSlots(deliveryDate).subscribe(data =>
      this.zone.run(() => {
        console.log(data);
        this.slotJson = data;
        this.changeSlotValue(this.orderVolume);
      }));
    console.log(this.slotJson);
  }

  changeSlotValue(orderVolume) {
    console.log(orderVolume);
    if (orderVolume > this.slotJson["timeSlot1"]["volume"]) {
      this.slotValid["slot1"] = false;
    } else {
      this.slotValid["slot1"] = true;
    }
    if (orderVolume > this.slotJson["timeSlot2"]["volume"]) {
      this.slotValid["slot2"] = false;
    } else {
      this.slotValid["slot2"] = true;
    }
    if (orderVolume > this.slotJson["timeSlot3"]["volume"]) {
      this.slotValid["slot3"] = false;
    } else {
      this.slotValid["slot3"] = true;
    }
  }

  setSlot(slotNumber: string) {
    if (this.selectedSlot != slotNumber) {
      this.selectedSlot = slotNumber;
    } else {
      this.selectedSlot = "";
    }
    console.log(this.selectedSlot);
  }

  submitOrder(customerName, customerNumber, customerAddress, deliveryDate, orderVolume): void {
    console.log(this.orderVolume);
    console.log(this.selectedSlot);
    if (customerName != "" && customerNumber != "" && customerAddress != "" && orderVolume != null && deliveryDate != "" && this.selectedSlot != "") {
      console.log(this.orderVolume);
      this.orderService.saveOrder(customerName, customerNumber, customerAddress, orderVolume, deliveryDate, this.selectedSlot, "pending", this.retailerEmail)
        .pipe(
          tap((newOrder) => {
            console.log(newOrder);
            this.savedOrder = newOrder
          }),
          catchError(error => {
            return Observable.throw("Something went wrong" + JSON.stringify(error));
          })
        ).subscribe(data => {
        this.success = true;
        let form = <HTMLFormElement>document.getElementById("orderForm");
        form.reset();
        this.slot1 = false;
        this.slot2 = false;
        this.slot3 = false;
        this.slotJson = null;
        this.slotValid = {"slot1": true, "slot2": true, "slot3": true};
      });
    }
  }
}
