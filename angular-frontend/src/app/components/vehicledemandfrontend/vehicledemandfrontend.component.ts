import {Component, Inject, OnInit} from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import {VehicledemandfrontendService} from '../../vehicledemandfrontend.service';
import {RetailerDetails} from '../../vehicledemanded';
import {DatePipe} from '@angular/common';
import {Router} from '@angular/router';
import {HttpClient} from '@angular/common/http';
import {VehicleService} from '../../services/vehicle.service';
import {Observable} from 'rxjs';
import {VehicleRentService} from '../../services/vehicle-rent.service';
import * as jwt_decode from 'jwt-decode';
import {VehicleDemanded} from '../../interfaces/vehicledemanded';
import {VehicleManagement} from "../../interfaces/vehicle-management";

@Component({
  selector: 'app-vehicledemandfrontend',
  templateUrl: './vehicledemandfrontend.component.html',
  styleUrls: ['./vehicledemandfrontend.component.css']
})
export class VehicledemandfrontendComponent implements OnInit {
  capacity: number;
  retailerId: string;
  slot: any;
  // date : string;
  vehicleStatus: string;
  myUrl: any;
  // Queryresponse: Observable<any>;
  vehiclequery: Array<any> = new Array<any>();
  vehicleDemanded: VehicleDemanded;
  flag = 'false';

  constructor(
    private dialog: MatDialog,
    private queryvehicleservice: VehicleService,
    private vehicleService: VehicledemandfrontendService,
    private datePipe: DatePipe,
    private router: Router,
    private http: HttpClient,
    private testservice: VehicleRentService
  ) {
    // this.date = this.datePipe.transform(this.date, 'yyyy-MM-dd');
  }

  ngOnInit() {
    // getting email from token
    var decoded = {
      userId: ''
    }
    let token = localStorage.getItem('token');
    if (token != null) {
      decoded = jwt_decode(token);
      this.retailerId = decoded.userId;
      console.log(this.retailerId);
    }

  }

  openDialog() {
    // this.dialog.open(RatecardpopupComponent);
  }

  sendRequest() {

    const retailerDetails = new RetailerDetails();
    // retailerDetails.date = this.date;
    retailerDetails.timeSlot = this.slot;
    retailerDetails.volume = this.capacity;
    console.log(retailerDetails.volume);
    console.log(retailerDetails.timeSlot);
    console.log(retailerDetails.date);
    this.vehicleService.sendRetailerRequest(retailerDetails).subscribe(
      result => {
        console.log(result);
      }, error => {
        console.log(error);
      }
    );
  }

  sendrequest() {
    this.flag = 'true';
    // this.testservice.getVCResponse(this.capacity, 'available').subscribe(vehicle => {
    //       this.vehiclequery = vehicle;
    //       console.log(vehicle);
    //       console.log('in slot 1');
    //     });


    if (this.slot === 'slot1') {
      this.queryvehicleservice.getvolumeandslot1(this.capacity, 'available').subscribe(vehicle => {
        this.vehiclequery = vehicle;
        console.log(vehicle);
        console.log('in slot 1');
      });
    } else if (this.slot === 'slot2') {
     this.queryvehicleservice.getvolumeandslot2(this.capacity, 'available').subscribe(vehicle => {
        this.vehiclequery = vehicle;
        console.log(vehicle);
        console.log('in slot 2');
      });
    } else {
      this.queryvehicleservice.getvolumeandslot3(this.capacity, 'available').subscribe(vehicle => {
        this.vehiclequery = vehicle;
        console.log(vehicle);
        console.log('in slot3');
      });
    }

  }

  demandrow(data: VehicleManagement) {
    console.log(data.capacity);
    this.vehicleDemanded = new VehicleDemanded();
    this.vehicleDemanded.capacity = data.capacity;
    this.vehicleDemanded.companyName = data.companyName;
    this.vehicleDemanded.costPerSlot = data.costPerSlot;
    this.vehicleDemanded.driverName = data.driverName;
    this.vehicleDemanded.retailerId = Number(this.retailerId);
    this.vehicleDemanded.id = data.id;
    this.vehicleDemanded.slot1 = data.slot1;
    this.vehicleDemanded.slot2 = data.slot2;
    this.vehicleDemanded.slot3 = data.slot3;
    this.vehicleDemanded.slot = this.slot;
    this.vehicleDemanded.vehicleNumber = data.vehicleNumber;
    this.vehicleDemanded.vehicleStatus = data.vehicleStatus;
    this.vehicleDemanded.vehicleType = data.vehicleType;
    console.log(this.vehicleDemanded);
    this.vehicleService.sendnewRetailerRequest(this.vehicleDemanded).subscribe();
  }
}
