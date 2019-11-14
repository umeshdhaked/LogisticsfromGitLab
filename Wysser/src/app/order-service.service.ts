import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  constructor(private http:HttpClient) { }

  checkSlots(deliveryDate, orderVolume){
    return this.http.get('http://localhost:');
  }
}
