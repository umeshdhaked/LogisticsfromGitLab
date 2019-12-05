import {Component, OnInit, NgZone} from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { from } from 'rxjs';
import { VehicleManagement } from 'src/app/interfaces/vehicle-management';

@Component({
  selector: 'app-requests',
  templateUrl: './requests.component.html',
  styleUrls: ['./requests.component.css']
})
export class RequestsComponent implements OnInit {

  Vehicles: Array<any>;

  constructor(private requestService: RequestService, private zone:NgZone) {
  }

  vehicle:VehicleManagement;

  ngOnInit() {

  //   setInterval(()=>{
  //     this.requestService.findallrequested().subscribe(data => {
  //       this.zone.run(()=>{
  //         this.Vehicles = data
  //       console.log(this.Vehicles)
  //       console.log('xyz')
  //       })
      
  //   }), 12000
  // });
  this.requestService.findallrequested().subscribe(data => {
          this.zone.run(()=>{
            this.Vehicles = data
          console.log(this.Vehicles)
          console.log('xyz')
          })
        
      });
      
  }

abv;

  AcceptRequest(data) {
 this.vehicle = data
    // this.vehicle.capacity = data.capacity;
    // this.vehicle.companyName = data.companyName;
    // this.vehicle.costPerSlot = data.costPerSlot;
    // this.vehicle.driverName = data.driverName;
    // this.vehicle.retailerId = data.retailerId;
    // this.vehicle.id = data.id;
    // this.vehicle.slot = data.slot;
    // this.vehicle.vehicleNumber = data.vehicleNumber;
    // this.vehicle.vehicleStatus = data.vehicleStatus;
    // this.vehicle.vehicleType = data.vehicleType;
    console.log(this.vehicle);
    this.requestService.sendAcceptRequest(this.vehicle).subscribe();
  }



}
