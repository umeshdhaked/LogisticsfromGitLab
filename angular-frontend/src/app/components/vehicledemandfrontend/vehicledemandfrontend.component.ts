import { Component,Inject, OnInit } from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {VehicledemandfrontendService} from "../../vehicledemandfrontend.service";
import {RetailerDetails} from "../../vehicledemanded";

@Component({
  selector: 'app-vehicledemandfrontend',
  templateUrl: './vehicledemandfrontend.component.html',
  styleUrls: ['./vehicledemandfrontend.component.css']
})
export class VehicledemandfrontendComponent implements OnInit {
  volume: string;
  slot: string;
  date: Date;

  constructor(
    private dialog: MatDialog,
    private vehicleService: VehicledemandfrontendService
  ) { }

  ngOnInit() {
  }
  openDialog() {
    // this.dialog.open(RatecardpopupComponent);
  }

  sendRequest() {

    const retailerDetails = new RetailerDetails();
    retailerDetails.date = this.date;
    retailerDetails.timeSlot = this.slot;
    retailerDetails.volume = this.volume;
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
}
