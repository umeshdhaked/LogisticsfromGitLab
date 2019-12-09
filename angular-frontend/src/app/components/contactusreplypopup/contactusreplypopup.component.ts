import {Component, OnInit} from '@angular/core';
import {InteractionService} from '../../services/interaction.service';
import {PendingResponse} from '../../interfaces/pendingreponse';
import {BehaviorSubject, Subscription} from 'rxjs';
import {Router} from "@angular/router";

@Component({
  selector: 'app-contactusreplypopup',
  templateUrl: './contactusreplypopup.component.html',
  styleUrls: ['./contactusreplypopup.component.css']
})
export class ContactusreplypopupComponent implements OnInit {
  data: any;
  body1: string;
  constructor(private interaction: InteractionService,
              private router: Router) {
  }

  ngOnInit() {
  }

  sendreply() {

    this.data = this.interaction.messageSource1;
    
    const urlgmail = 'https://mail.google.com/mail/u/0/?view=cm&fs=1&tf=1&to=' + this.data.email + '&su=' + this.data.subject + '&body=' + this.body1;
    window.open(urlgmail);
  }
}
