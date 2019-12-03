import {Component, Inject, OnInit} from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {VehicledemandfrontendService} from "../../vehicledemandfrontend.service";
import {RetailerDetails} from "../../vehicledemanded";
import {DatePipe} from '@angular/common';
import {Router} from "@angular/router";
import {environment} from "../../../environments/environment";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-vehicledemandfrontend',
  templateUrl: './vehicledemandfrontend.component.html',
  styleUrls: ['./vehicledemandfrontend.component.css']
})
export class VehicledemandfrontendComponent implements OnInit {
  volume: string;
  slot: string;
  // date : string;
  vehicleStatus: string;
  myUrl: any;

  constructor(
    private dialog: MatDialog,
    private vehicleService: VehicledemandfrontendService,
    private datePipe: DatePipe,
    private router: Router,
    private http: HttpClient
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

  sendrequest() {
    if (this.slot === 'slot1') {
      this.myUrl = environment.apiUrl + 'queryslot1/'  + '/' + 'available';
      return this.http.get(this.myUrl, {
        responseType: 'text'
      });
    }
  }
}
