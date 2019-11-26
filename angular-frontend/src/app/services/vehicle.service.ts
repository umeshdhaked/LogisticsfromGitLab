import { Injectable } from '@angular/core';
import { Vehicle } from '../interfaces/vehicle';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {
  private upersons: Vehicle[] = [
    // {
    //     id: 1,
    //     vehicleNumber:'A302',
    //     driverName: 'Rajender',
    //     vehicleType: 'car',
    //     capacity: 100,
    //     costPerSlot: 100,
    //     vehicleStatus: 'Busy'
    // },
    // {
    //   id: 2,
    //   vehicleNumber:'A303',
    //   driverName: 'Arkov',
    //   vehicleType: 'truck',
    //   capacity: 500,
    //   costPerSlot: 500,
    //   vehicleStatus: 'free'
    // }

  ]
  constructor(public http: HttpClient) { }

  getVehiclesFromData(): Vehicle[] {
    return this.upersons;
  }


  addVehicle(vehicle: Vehicle) {
    vehicle.id = this.upersons.length + 1;
    this.upersons.push(vehicle);
    
   
    this.http.post('http://localhost:8080/api/v1/vehicle', vehicle).subscribe();

  }
  updateVehicle(vehicle: Vehicle) {
    let index = this.upersons.findIndex(u => vehicle.id === u.id);
    this.upersons[index] = vehicle;
  }
  deleteVehicle(vehicle: Vehicle) {
    this.upersons.splice(this.upersons.indexOf(vehicle), 1);

    console.log(vehicle.id);

    let url = "http://localhost:8080/api/v1/vehicle/" + vehicle.id;

    this.http.delete(url).subscribe();
  }

  getAllVehicles(): Observable<any> {
    let url = "http://localhost:8080/api/v1/vehicles";

    return this.http.get(url);
  }

}
