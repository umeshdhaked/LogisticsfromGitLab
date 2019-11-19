import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Slots } from './slots';
import { Order } from './order';
import { environment } from '../environments/environment.prod';

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  constructor(private http:HttpClient) { }

  checkSlots(deliveryDate, orderVolume): Observable<Slots[]>{
    let url = environment.apiUrl + ':8084/orders/slots?date=' + deliveryDate + '&volume=' + orderVolume;
    return this.http.get<Slots[]>(url);
  }

  saveOrder(customerName, customerNumber, customerAddress, orderVolume, deliveryDate, slotNumber): Observable<Order[]>{
    let url = environment.apiUrl + ":8084/orders/save";
    let data = {"customerName": customerName, "customerAddress": customerAddress, "customerNumber": customerNumber, "orderVolume": orderVolume, "deliveryDate": deliveryDate, "slotNumber": slotNumber};
    return this.http.post<Order[]>(url, JSON.stringify(data),{headers:{'Content-Type': 'application/json', 'Access-Control-Allow-Origin':'*'}});
  }
}
