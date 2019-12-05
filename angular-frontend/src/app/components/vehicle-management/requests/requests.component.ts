import {Component, OnInit} from '@angular/core';
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

  constructor(private requestService: RequestService) {
  }

  // vehicle:VehicleManagement;
  vehicle= new VehicleManagement();

  ngOnInit() {

    this.requestService.findallrequested().subscribe(data => {
      this.Vehicles = data
    
    });



  }
  AcceptRequest(data) {
    
    this.vehicle = data;
    this.vehicle.requestStatus='Accepted';
    console.log(this.vehicle);
    this.requestService.sendAccept(this.vehicle).subscribe();
  }

  RejectRequest(data){
    this.vehicle = data
    this.vehicle.requestStatus='Rejected';
    console.log(this.vehicle);
    this.requestService.sendReject(this.vehicle).subscribe();
  }



}
