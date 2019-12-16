import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import {Observable} from 'rxjs';
import { Deliveryroute } from '../interfaces/deliveryroute';
import { Driver } from '../interfaces/driver';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DriverDashboardService {

  constructor(private http:HttpClient) { }


  getDeliveryRoute(date, vehicleId, timeslot): Observable<Deliveryroute> {
    let uri = environment.apiUrl + ":8086/dashboard/getNextDeliveryRoute?date=" + date + "&vehicleId=" + vehicleId + "&timeslot=" + timeslot;
    return this.http.get<Deliveryroute>(uri);
  }

  acceptDelivery(vehicleId: String) {
    let uri = environment.apiUrl + ":8086/dashboard/accept";
    let data = {"vehicleId": vehicleId};

    return this.http.post(uri, JSON.stringify(data), {headers: {'Content-Type': 'application/json'}});
  }

  rejectDelivery(vehicleId: String) {
    let uri = environment.apiUrl + ":8086/dashboard/reject";
    let data = {"vehicleId": vehicleId};

    return this.http.post(uri, JSON.stringify(data), {headers: {'Content-Type': 'application/json'}});
  }

  authenticateDriver(username: String, password: String){
    let uri = environment.apiUrl + ":8095/api/v1/findByVehicleNumber/" + username;

    return this.http.get<Driver>(uri);
  }




}
