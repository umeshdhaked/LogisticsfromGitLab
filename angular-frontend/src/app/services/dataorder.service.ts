import { Message } from './../interfaces/message';

import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataorderService {
  url = environment.apiUrl  + ':8084/orders/findAll';
  url2 = environment.apiUrl + ':8084/orders/updateOrder';
  
  constructor(private http: HttpClient) { }
  getdata() {
    return this.http.get(this.url);
  }

  updateOrderStatus(id: number, status: string) {
    return this.http.put(this.url2, {}, {
      params: new HttpParams().set('id', id.toString()).append('orderStatus', status)
    });
  }

  deleteOrder(orderId){
    var url3 = environment.apiUrl + ':8091/api/v1/order/' + orderId;
    return this.http.delete<Message>(url3);
  }
}
