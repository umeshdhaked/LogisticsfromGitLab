import {Component, OnInit, NgZone} from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { from } from 'rxjs';
import { VehicleManagement } from 'src/app/interfaces/vehicle-management';
import * as jwt_decode from 'jwt-decode';
import { DecodedJwtData } from 'src/app/interfaces/decoded-jwt-data';
import { VechicleCompanyServiceService } from 'src/app/services/vechicle-company-service.service';
@Component({
  selector: 'app-requests',
  templateUrl: './requests.component.html',
  styleUrls: ['./requests.component.css']
})
export class RequestsComponent implements OnInit {

  Vehicles: Array<any>;

  dataFromToken:DecodedJwtData;
  cName;
  vehicleCompanyData;

  constructor(private requestService: RequestService, private zone:NgZone, private vehicleCompanyService: VechicleCompanyServiceService) {
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

  
if(localStorage.getItem('token')!=null){
  this.dataFromToken= jwt_decode(localStorage.getItem('token'));
}

this.vehicleCompanyService.getVehicleCompanyProfileFromEmail(this.dataFromToken.sub).subscribe((data: any) => {
  this.vehicleCompanyData = data;
  if (this.vehicleCompanyData != null) {
    this.cName = ''+this.vehicleCompanyData.companyName;
  }
})




  this.requestService.findallrequested(this.cName).subscribe(data => {
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
    this.requestService.saveAcceptedVehicle(this.vehicle).subscribe();

    this.requestService.sendAccepttovehicledemand(this.vehicle).subscribe();
    this.requestService.deleteinretailerdemand(this.vehicle.id).subscribe();

  }

  RejectRequest(data){
    this.vehicle = data
    this.vehicle.requestStatus='Rejected';
    console.log(this.vehicle);
    this.requestService.sendReject(this.vehicle).subscribe();

    //..................save vehicle after rejected in vehicle Company...........................

    this.requestService.saveRejectVehicle(this.vehicle).subscribe();
    
    this.requestService. sendRejecttovehicledemand(this.vehicle).subscribe();
    this.requestService.deleteinretailerdemand(this.vehicle.id).subscribe();
  }



}
