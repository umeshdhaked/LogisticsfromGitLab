import {Component, Inject, OnInit} from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import {VehicledemandfrontendService} from '../../vehicledemandfrontend.service';
import {RetailerDetails} from '../../vehicledemanded';
import {DatePipe} from '@angular/common';
import {Router} from '@angular/router';
import {HttpClient} from '@angular/common/http';
import {VehicleService} from '../../services/vehicle.service';
import {Observable} from 'rxjs';
import {VehicleRentService} from "../../services/vehicle-rent.service";

@Component({
  selector: 'app-vehicledemandfrontend',
  templateUrl: './vehicledemandfrontend.component.html',
  styleUrls: ['./vehicledemandfrontend.component.css']
})
export class VehicledemandfrontendComponent implements OnInit {
  capacity: number;

  slot: any;
  // date : string;
  vehicleStatus: string;
  myUrl: any;
  // Queryresponse: Observable<any>;
  vehiclequery: Array<any> = new Array<any>();

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
}
