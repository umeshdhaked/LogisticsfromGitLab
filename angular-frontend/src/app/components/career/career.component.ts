import { Component, OnInit } from '@angular/core';
import {CareerService} from '../../services/career.service';
import {Career} from '../../interfaces/Career';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-career',
  templateUrl: './career.component.html',
  styleUrls: ['./career.component.css']
})
export class CareerComponent implements OnInit {
  // tslint:disable-next-line:ban-types
  career: Object = new Array<any>();
  constructor( private careerService: CareerService) { }

  ngOnInit() {
   this.careerService.getDataFromCareer().subscribe(res => {
     this.career = res;
   });

   for (const entry of this.career) {
      console.log(entry); // 1, "string", false
    }
  }

}
