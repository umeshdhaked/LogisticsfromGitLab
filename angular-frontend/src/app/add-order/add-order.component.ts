import { Component, OnInit } from '@angular/core';
import { OrderServiceService } from '../services/order-service.service';
import { catchError, tap } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-add-order',
  templateUrl: './add-order.component.html',
  styleUrls: ['./add-order.component.css']
})
export class AddOrderComponent implements OnInit {
  success: boolean = false;
  slots = [];
  slotJson = [];
  date = new Date(Date.now());
  today = new Date(this.date.getTime() - (this.date.getTimezoneOffset() * 60000 )).toISOString().split("T")[0];

  constructor(private orderService: OrderServiceService) { }

  ngOnInit() {
  }

  checkSlotsOnDate(deliveryDate,  orderVolume){
      this.orderService.checkSlots(deliveryDate, orderVolume).subscribe(data => {
      this.slotJson = data
      this.parseSlotsJson(this.slotJson)});
     console.log(this.slotJson);
  }

  parseSlotsJson(data){
    if(data["slot1"] == true){
      this.slots.push("Slot1");
    }
    if(data["slot2"] == true){
      this.slots.push("Slot2");
    }
    if(data["slot3"] == true){
      this.slots.push("Slot3");
    }
    console.log(this.slots);
  }

  submitOrder(customerName, customerNumber, customerAddress, orderVolume, deliveryDate, slotNumber): void{
    if(customerName!=""&&customerNumber!=""&&customerAddress!=""&&orderVolume!=null&&deliveryDate!=""&&slotNumber !=""){
      this.orderService.saveOrder(customerName, customerNumber, customerAddress, orderVolume, deliveryDate, slotNumber)
      .pipe(
        tap((newOrder) => console.log(newOrder)),
        catchError(error =>{
          return Observable.throw("Something webt wrong"+JSON.stringify(error));
        })
      ).subscribe(data => {
        this.success = true;
      });
  }
  }
}
