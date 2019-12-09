import {Component, OnInit} from '@angular/core';
import {Orderdata} from '../../interfaces/orderdata';
import {Router} from '@angular/router';
import {InteractionService} from '../../services/interaction.service';
import {DataorderService} from '../../services/dataorder.service';
import {MatDialog} from '@angular/material/dialog';
import {CanceldialogueComponent} from '../canceldialogue/canceldialogue.component';
import {DatafromrouteoptimizerService} from '../../services/datafromrouteoptimizer.service';

@Component({
  selector: 'app-maindriverdashboard',
  templateUrl: './maindriverdashboard.component.html',
  styleUrls: ['./maindriverdashboard.component.css']
})
export class MaindriverdashboardComponent implements OnInit {
  temp = new Array<any>();
  // vehicleId: string;
  retailerId: string;
  slot = 'slot1';
  currentorder = 0;
  vehicleId = localStorage.getItem('vehicleNumber');

  orderData: any[];
  orderRoutes = [];

  constructor(private router: Router,
              private interactionserv: InteractionService,
              private dataorder: DataorderService,
              public dialog: MatDialog,
              private datafromoptimizer: DatafromrouteoptimizerService) {
  }

  ngOnInit() {
    this.temp[0] = new Orderdata();
    this.temp[1] = new Orderdata();
    this.datafromoptimizer.getorderdatafromrouteoptimizer().then(
      (result: any[]) => {
        this.orderData = result;
        this.processOrder();
      }
    );
  }


  processOrder() {
    console.log(this.orderData);
    this.orderData.forEach(
      (order: any) => {
        this.temp[0].customerAddress = order.depotAddress;
        console.log(this.temp[0].customerAddress);
        const processedString = order.routes.toString().replace('[', '').replace(']', '');
        processedString.split('{').forEach(
          addr => {
            if (addr.length !== 0) {
              const routeX = {};
              addr.replace('}', '').split(',').forEach(
                propertyValue => {
                  const property = propertyValue.split(':')[0]
                    .replace('"', '')
                    .replace('"', '');
                  // noinspection UnnecessaryLocalVariableJS
                  const value = propertyValue.split(':')[1];
                  if (property.length !== 0) {
                    routeX[property] = value;
                  }
                });
              this.orderRoutes.push(routeX);
            }
          });
        console.log(this.orderRoutes);
        console.log(this.orderRoutes[0].customerAddress);
        this.temp[1].orderId = this.orderRoutes[0].orderId;
        this.temp[1].customerAddress = this.orderRoutes[0].customerAddress;
        console.log(this.temp[1].customerAddress);

        for (let i = 0; i < this.orderRoutes.length; i++) {
          if (this.orderRoutes[i].orderStatus === 'pending') {
            this.currentorder = i;
            this.temp[0] = this.orderData[i];
            this.temp[1] = this.orderData[i + 1];
            console.log(this.temp[0]);
            console.log(this.temp[1]);
            break;
          }
        }
      }
    );
  }

  navigate() {
    this.interactionserv.sendMessage(this.temp[0].customerAddress + ' ' + this.temp[1].customerAddress);
    this.router.navigateByUrl('navigate');
  }

  signature() {
    // for(let vehicle of this.orderData){
    // }
    this.orderRoutes[this.currentorder].orderStatus = 'delivered';
    this.dataorder.updateOrderStatus(this.orderRoutes[this.currentorder].orderId,
      this.orderRoutes[this.currentorder].orderStatus)
      .toPromise().then(
      result => {
        console.log(result);
      },
      reason => {
        console.log(reason);
      });
    console.log(this.orderData);
    this.router.navigateByUrl('signature');
  }

  //
  openDialogue() {
    this.dialog.open(CanceldialogueComponent);
  }

  //
  delayDelivery() {
    this.orderRoutes[this.currentorder].orderStatus = 'delayed';
    this.dataorder.updateOrderStatus(this.orderRoutes[this.currentorder].orderId,
      this.orderRoutes[this.currentorder].orderStatus).toPromise().then(
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
