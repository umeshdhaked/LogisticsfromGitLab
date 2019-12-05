import {Component, OnInit, NgZone} from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { from } from 'rxjs';

@Component({
  selector: 'app-requests',
  templateUrl: './requests.component.html',
  styleUrls: ['./requests.component.css']
})
export class RequestsComponent implements OnInit {

  Vehicles: Array<any>;

  constructor(private requestService: RequestService, private zone:NgZone) {
  }

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

}
