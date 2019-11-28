import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { VehicleManagement } from '../interfaces/vehicle-management';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {
  private upersons: VehicleManagement[] = [
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

  getVehiclesFromData(): VehicleManagement[] {
    return this.upersons;
  }


  addVehicle(vehicle: VehicleManagement) {
    // vehicle.id = this.upersons.length + 1;
    this.upersons.push(vehicle);
    
  let uri = environment.apiUrl + ":8095/api/v1/vehicle";
   
    this.http.post(uri, vehicle).subscribe();

  }
  updateVehicle(vehicle: VehicleManagement) {
    let index = this.upersons.findIndex(u => vehicle.id === u.id);
    this.upersons[index] = vehicle;
  }
  deleteVehicle(vehicle: VehicleManagement) {
    this.upersons.splice(this.upersons.indexOf(vehicle), 1);

    console.log(vehicle.id);

    let url = environment.apiUrl +":8095/api/v1/vehicle/" + vehicle.id;

    this.http.delete(url).subscribe();
  }

  getAllVehicles(): Observable<any> {
    let url = environment.apiUrl+":8095/api/v1/vehicles";

    return this.http.get(url);
  }

}
