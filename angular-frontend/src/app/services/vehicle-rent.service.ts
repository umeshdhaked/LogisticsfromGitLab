import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Vehicle } from '../interfaces/vehicle';

@Injectable({
  providedIn: 'root'
})
export class VehicleRentService {

  constructor(private http: HttpClient) { }

  getBookedVehicles(){
    let url = 'assets/static/vehicles.json';
    return this.http.get<Vehicle[]>(url);
  }
}
