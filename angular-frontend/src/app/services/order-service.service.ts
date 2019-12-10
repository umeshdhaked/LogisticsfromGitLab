import { RouteOrder } from './../interfaces/route-order';
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Slots} from '../interfaces/slots';
import {Order} from '../interfaces/order';
import {environment} from '../../environments/environment';
import {DateDemand} from '../interfaces/date-demand';
import { Message } from '../interfaces/message';

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  constructor(private http: HttpClient) {
  }

  checkSlots(retailerId): Observable<DateDemand> {
    let url = environment.apiUrl + ':8084/orders/slots?retailerId=' + retailerId;
    return this.http.get<DateDemand>(url);
  }

  saveOrder(customerName, customerNumber, customerAddress, orderVolume, deliveryDate, slotNumber, orderStatus, retailerId): Observable<Order[]> {
    let url = environment.apiUrl + ":8084/orders/save";
    let url2 = environment.apiUrl + ":8091/api/v1/order";
    console.log(orderStatus);
    console.log(customerNumber);
    let data = {
      "customerName": customerName,
      "customerAddress": customerAddress,
      "customerPhoneNumber": customerNumber,
      "orderVolume": orderVolume,
      "deliveryDate": deliveryDate,
      "slotNumber": slotNumber,
      "orderStatus": orderStatus,
      "retailerId": retailerId
    };

    let routeData = {
      "customerName": customerName,
      "customerAddress": customerAddress,
      "customerPhoneNumber": customerNumber,
      "orderVolume": orderVolume,
      "deliveryDate": deliveryDate,
      "slotNumber": slotNumber,
      "orderStatus": orderStatus,
      "wholesalerId": retailerId
    };
    this.http.get<Message>(environment.apiUrl + ":9090/searchByRetailerIdAndSlot/" + retailerId + "/" + slotNumber);
    this.http.post<RouteOrder[]>(url2, JSON.stringify(routeData), {
      headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*'
      }
    });

    return this.http.post<Order[]>(url, JSON.stringify(data), {
      headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*'
      }
    });
  }

  getAllOrderData(retailerEmail) {
    // let url = 'assets/static/orders.json';
    let url = environment.apiUrl + ":8084/orders/findAllOrdersOfRetailer?retailerId=" + retailerEmail
    return this.http.get<Order[]>(url);
  }

  getCompletedOrders(retailerEmail) {
    // let url = 'assets/static/delivered.json';
    let url = environment.apiUrl + ":8084/orders/findOrdersByStatus?retailerId=" + retailerEmail + "&orderStatus=delivered"
    return this.http.get<Order[]>(url);
  }

  getPendingOrders(retailerEmail) {
    //let url = 'assets/static/pending.json';
    let url = environment.apiUrl + ":8084/orders/findOrdersByStatus?retailerId=" + retailerEmail + "&orderStatus=pending"
    return this.http.get<Order[]>(url);
  }
}
