import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-order',
  templateUrl: './add-order.component.html',
  styleUrls: ['./add-order.component.css']
})
export class AddOrderComponent implements OnInit {

  slots = [];
  date = new Date(Date.now());
  today = new Date(this.date.getTime() - (this.date.getTimezoneOffset() * 60000 )).toISOString().split("T")[0];

  constructor() { }

  ngOnInit() {
  }

}
