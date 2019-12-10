import {Component, OnInit, NgZone} from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { from } from 'rxjs';
import { VehicleManagement } from 'src/app/interfaces/vehicle-management';
import * as jwt_decode from 'jwt-decode';
import { DecodedJwtData } from 'src/app/interfaces/decoded-jwt-data';
import { VechicleCompanyServiceService } from 'src/app/services/vechicle-company-service.service';
import { Driver } from 'src/app/interfaces/driver';

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
    this.requestService.findallrequested(this.cName).subscribe(data => {
      this.zone.run(()=>{
        console.log(this.cName);
        this.Vehicles = data
      console.log(this.Vehicles)
      console.log('xyz')
      })
    
  });
  }
})




  // this.requestService.findallrequested(this.cName).subscribe(data => {
  //         this.zone.run(()=>{
  //           console.log(this.cName);
  //           this.Vehicles = data
  //         console.log(this.Vehicles)
  //         console.log('xyz')
  //         })
        
  //     });
      
  }
  AcceptRequest(data) {
    
    this.vehicle = data;
    this.vehicle.requestStatus='Accepted';
    this.vehicle.remainingCapacity = this.vehicle.capacity;
    console.log(this.vehicle);
    this.requestService.sendAccept(this.vehicle).subscribe();
    //.....................save vehicle after accepted by vehicle company............
    var driver: Driver = new Driver();
    driver.id = this.vehicle.id;
    driver.vehicleNumber = this.vehicle.vehicleNumber;
    driver.driverName = this.vehicle.driverName;
    driver.vehicleType = this.vehicle.vehicleType;
    driver.capacity = this.vehicle.capacity;
    driver.costPerSlot = this.vehicle.costPerSlot;
    driver.vehicleStatus = this.vehicle.vehicleStatus;
  // date: string;
    driver.slot1=this.vehicle.slot1;
  driver.slot2 = this.vehicle.slot2;
  driver.slot3 = this.vehicle.slot3 ;
  driver.companyName = this.vehicle.companyName ;
  driver.slot = this.vehicle.slot ;
  driver.retailerId = this.vehicle.retailerId ;
  driver.requestStatus = this.vehicle.requestStatus ;
  driver.remainingCapacity = this.vehicle.remainingCapacity;
  driver.password = Math.random().toString(36).slice(-8);
  console.log(driver);
    this.requestService.saveAcceptedVehicle(driver).subscribe();

    this.requestService.sendAccepttovehicledemand(this.vehicle).subscribe();
    this.requestService.deleteinretailerdemand(this.vehicle.id).subscribe(()=>{
      alert("Request Accepted!");
    });

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
