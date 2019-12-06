import { Component, OnInit } from '@angular/core';
import {Orderdata} from '../../interfaces/orderdata';
import {Router} from '@angular/router';
import {InteractionService} from '../../services/interaction.service';
import {DataorderService} from '../../services/dataorder.service';
import {MatDialog} from '@angular/material/dialog';
import {CanceldialogueComponent} from '../canceldialogue/canceldialogue.component';
import {async} from "@angular/core/testing";
import {DatafromrouteoptimizerService} from "../../services/datafromrouteoptimizer.service";

@Component({
  selector: 'app-maindriverdashboard',
  templateUrl: './maindriverdashboard.component.html',
  styleUrls: ['./maindriverdashboard.component.css']
})
export class MaindriverdashboardComponent implements OnInit {
  temp = new Array<Orderdata>();
  currentorder: any;
  orderData: Orderdata[];
  constructor(private router: Router,
              private interactionserv: InteractionService,
              private datafromrouteoptimizer: DatafromrouteoptimizerService,
              private dataorder: DataorderService,
              public dialog: MatDialog) { }

  async ngOnInit() {
    this.temp[0] = new Orderdata();
    this.temp[1] = new Orderdata();
    // for (let i = 0 ; i < this.orderData.length ; i++) {
    //   if (this.orderData[i].status === 'pending') {
    //
    //     this.temp[0]  = this.orderData[i + 1];
    //     console.log(this.temp);
    //     break;
    //   }
    // }
    this.orderData = await this.dataorder.getdata().toPromise().then(
      value => {
        console.log(value);
        return value as Orderdata[];
      }
    );
    console.log(this.orderData);
    for (let i = 0; i < this.orderData.length; i++) {
      if (this.orderData[i].orderStatus === 'pending') {
        this.currentorder = i;
        this.temp[0] = this.orderData[i];
        this.temp[1] = this.orderData[i + 1];
        console.log(this.temp[0]);
        console.log(this.temp[1]);
        break;
      }
    }
  }
  navigate() {
    this.interactionserv.sendMessage(this.temp[0].customerAddress + ' ' + this.temp[1].customerAddress);
    this.router.navigateByUrl('navigate');
  }

  signature() {

    // for(let vehicle of this.orderData){

    // }
    this.orderData[this.currentorder].orderStatus = 'delivered';
    this.dataorder.updateOrderStatus(this.orderData[this.currentorder].id, this.orderData[this.currentorder].orderStatus).toPromise().then(
      result => {
        console.log(result);
      },
      reason => {
        console.log(reason);
      });
    console.log(this.orderData);

    this.router.navigateByUrl('signature');
  }

  openDialogue() {
    this.dialog.open(CanceldialogueComponent);
  }

  delayDelivery() {
    this.orderData[this.currentorder].orderStatus = 'delayed';
    this.dataorder.updateOrderStatus(this.orderData[this.currentorder].id, this.orderData[this.currentorder].orderStatus).toPromise().then(
      result => {
        console.log(result);
      },
      reason => {
        console.log(reason);
      });
    console.log(this.orderData);
    this.router.navigateByUrl('driverdashboard');
  }
}
