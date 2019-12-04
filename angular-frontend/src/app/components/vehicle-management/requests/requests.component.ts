import {Component, OnInit} from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { from } from 'rxjs';

@Component({
  selector: 'app-requests',
  templateUrl: './requests.component.html',
  styleUrls: ['./requests.component.css']
})
export class RequestsComponent implements OnInit {

  Vehicles: Array<any>;

  constructor(private requestService: RequestService) {
  }

  ngOnInit() {

    this.requestService.findallrequested().subscribe(data => {
      this.Vehicles = data
      console.log(this.Vehicles)
      console.log('xyz')
    });



  }

}
