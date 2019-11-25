import { Component, OnInit, NgZone } from '@angular/core';
import { OrderServiceService } from '../services/order-service.service';
import { catchError, tap } from 'rxjs/operators';
import { Observable } from 'rxjs';
import { Order } from '../interfaces/order';

@Component({
  selector: 'app-add-order',
  templateUrl: './add-order.component.html',
  styleUrls: ['./add-order.component.css']
})
export class AddOrderComponent implements OnInit {
  success: boolean = false;
  //property which indicates whether a given slot can be picked
  slotValid = {"slot1": true, "slot2": true, "slot3" : true};
  slotJson = [];

  slot1:boolean = false;
  slot2:boolean = false;
  slot3:boolean = false;

  orderVolume: number = 5;

  selectedSlot: string;
  date = new Date(Date.now());
  today = new Date(this.date.getTime() - (this.date.getTimezoneOffset() * 60000 )).toISOString().split("T")[0];

  savedOrder: Order[];

  constructor(private orderService: OrderServiceService, private zone:NgZone) { }

  ngOnInit() {
  }

  checkSlotsOnDate(deliveryDate){
      this.orderService.checkSlots(deliveryDate).subscribe(data =>
        this.zone.run(() => 
        {
          this.slotJson = data;
          this.changeSlotValue(this.orderVolume);
        }));
     console.log(this.slotJson);
  }

  changeSlotValue(orderVolume){
    if(orderVolume > this.slotJson["slot1"]){
      this.slotValid["slot1"] = false;
    }else{
      this.slotValid["slot1"] = true;
    }
    if(orderVolume > this.slotJson["slot2"]){
      this.slotValid["slot2"] = false;
    }else{
      this.slotValid["slot2"] = true;
    }
    if(orderVolume > this.slotJson["slot3"]){
      this.slotValid["slot3"] = false;
    }else{
      this.slotValid["slot3"] = true;
    }
  }

  setSlot(slotNumber: string){
    if(this.selectedSlot != slotNumber){
      this.selectedSlot = slotNumber;
    }else{
      this.selectedSlot = "";
    } 
    console.log(this.selectedSlot);
  }

  submitOrder(customerName, customerNumber, customerAddress, deliveryDate): void{
    console.log(this.orderVolume);
    console.log(this.selectedSlot);
    if(customerName!=""&&customerNumber!=""&&customerAddress!=""&&this.orderVolume!=null&&deliveryDate!=""&&this.selectedSlot !=""){
      console.log(this.orderVolume);
      this.orderService.saveOrder(customerName, customerNumber, customerAddress, this.orderVolume, deliveryDate, this.selectedSlot, "pending")
      .pipe(
        tap((newOrder) => {console.log(newOrder); this.savedOrder = newOrder}),
        catchError(error =>{
          return Observable.throw("Something went wrong"+JSON.stringify(error));
        })
      ).subscribe(data => {
        this.success = true;
        let form = <HTMLFormElement>document.getElementById("orderForm");
        form.reset();
        this.slot1 = false;
        this.slot2 = false;
        this.slot3 = false;
        this.slotJson = [];
        this.slotValid = {"slot1": true, "slot2": true, "slot3" : true};
      });
  }
  }
}
