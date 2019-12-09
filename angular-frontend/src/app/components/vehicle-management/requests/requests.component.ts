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

  // vehicle:VehicleManagement;
  vehicle= new VehicleManagement();

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
  AcceptRequest(data) {
    
    this.vehicle = data;
    this.vehicle.requestStatus='Accepted';
    this.vehicle.remainingCapacity = this.vehicle.capacity;
    console.log(this.vehicle);
    this.requestService.sendAccept(this.vehicle).subscribe();
    //.....................save vehicle after accepted by vehicle company............
    this.requestService.saveAccept(this.vehicle).subscribe();

    this.requestService.sendAccepttovehicledemand(this.vehicle).subscribe();
    this.requestService.deleteinretailerdemand(this.vehicle.id).subscribe();

  }

  RejectRequest(data){
    this.vehicle = data
    this.vehicle.requestStatus='Rejected';
    console.log(this.vehicle);
    this.requestService.sendReject(this.vehicle).subscribe();

    //..................save vehicle after rejected...........................

    this.requestService.saveReject(this.vehicle).subscribe();
    
    this.requestService. sendRejecttovehicledemand(this.vehicle).subscribe();
    this.requestService.deleteinretailerdemand(this.vehicle.id).subscribe();
  }



}
