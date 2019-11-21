import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Slots } from '../interfaces/slots';
import { Order } from '../interfaces/order';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  constructor(private http:HttpClient) { }

  checkSlots(deliveryDate): Observable<Slots[]>{
    let url = environment.apiUrl + ':8084/orders/slots?date=' + deliveryDate;
    return this.http.get<Slots[]>(url);
  }

  saveOrder(customerName, customerNumber, customerAddress, orderVolume, deliveryDate, slotNumber, orderStatus): Observable<Order[]>{
    let url = environment.apiUrl + ":8084/orders/save";
    console.log(orderStatus);
    console.log(customerNumber);
    let data = {"customerName": customerName, "customerAddress": customerAddress, "customerPhoneNumber": customerNumber, "orderVolume": orderVolume, "deliveryDate": deliveryDate, "slotNumber": slotNumber, "orderStatus": orderStatus};
    return this.http.post<Order[]>(url, JSON.stringify(data),{headers:{'Content-Type': 'application/json', 'Access-Control-Allow-Origin':'*'}});
  }
}
