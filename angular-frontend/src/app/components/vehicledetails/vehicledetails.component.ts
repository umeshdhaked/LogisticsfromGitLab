import {Component, OnInit} from '@angular/core';
import {VehicleService} from '../../services/vehicle.service';
import {VehicleManagement} from '../../interfaces/vehicle-management';
import {HttpRequest} from '@angular/common/http';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-vehicledetails',
  templateUrl: './vehicledetails.component.html',
  styleUrls: ['./vehicledetails.component.css']
})
export class VehicledetailsComponent implements OnInit {
  public allvehicles: Array<any>;

  constructor(private vehicleservice: VehicleService) {
  }

  ngOnInit() {
    this.vehicleservice.getAllVehicles().subscribe(
      vehicles => {
        this.allvehicles = vehicles;
      }
    );
  }
}
