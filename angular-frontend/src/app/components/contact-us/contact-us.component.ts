import { Component, OnInit } from '@angular/core';
import {PendingResponse} from '../../interfaces/pendingreponse';
import {AdminService} from '../../services/admin.service';

@Component({
  selector: 'app-contact-us',
  templateUrl: './contact-us.component.html',
  styleUrls: ['./contact-us.component.css']
})
export class ContactUsComponent implements OnInit {
  pendingrequest: PendingResponse;
  constructor(private adminservice: AdminService) { }

  ngOnInit() {
    this.pendingrequest.replyStatus = false;

  }
// this.pendingrequest.replystatus = false;


  sendandsave() {
    this.adminservice.postnewcontactus(this.pendingrequest);
  }
}
