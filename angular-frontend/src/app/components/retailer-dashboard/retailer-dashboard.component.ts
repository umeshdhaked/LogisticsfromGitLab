import {Component, OnInit, NgZone} from '@angular/core';
import {OrderServiceService} from '../../services/order-service.service';
import {ChartDataSets, ChartOptions, ChartType} from 'chart.js';
import {Color, Label, MultiDataSet} from 'ng2-charts';
import {VehicleRentService} from '../../services/vehicle-rent.service';
import * as jwt_decode from 'jwt-decode';
import {Router} from "@angular/router";

@Component({
  selector: 'app-retailer-dashboard',
  templateUrl: './retailer-dashboard.component.html',
  styleUrls: ['./retailer-dashboard.component.css']
})
export class RetailerDashboardComponent implements OnInit {
  retailerEmail: string = "";
  orderData = [];
  pendingOrders: number = 0;
  deliveredOrders: number = 0;

  totalOrdersPerDay = [];
  orderDates = [];
  rentedVehicles = [];

  //line chart data
  lineChartData: ChartDataSets[] = [];
  lineChartLabels: Label[] = [];
  lineChartOptions = {
    responsive: true,
    scales: {
      xAxes: [{
        gridLines: {
          drawOnChartArea: false
        }
      }],
      yAxes: [{
        gridLines: {
          drawOnChartArea: false
        }
      }]
    }
  };
  lineChartColors: Color[] = [
    {
      borderColor: 'black',
      backgroundColor: 'rgba(80,80,141,0.28)',
      borderWidth: 1
    },
  ];
  lineChartLegend = true;
  lineChartPlugins = [];
  lineChartType = 'line';

  //doughnut chart
  doughnutChartLabels: Label[] = ['11:00-13:00', '14:00-16:00', '17:00-19:00'];
  doughnutChartData: MultiDataSet = [];
  doughnutChartType: ChartType = 'doughnut';

  //vehicles tables
  tableColumns: string[] = ['vehicleId', 'date', 'volume', 'timeSlot'];

  constructor(private orderService: OrderServiceService, private zone: NgZone, private rentedVehicleService: VehicleRentService,private router:Router) {
  }

  ngOnInit() {
    var decoded = {
      "sub": ""
    }
    let token = localStorage.getItem('token');

    if (token != null) {
      decoded = jwt_decode(token);
      this.retailerEmail = decoded.sub;
    }
    this.orderService.getAllOrderData(this.retailerEmail).subscribe(data =>
      this.zone.run(() => {
        this.orderData = data;
        this.populateLineChartData(this.orderData);
        this.populateDoughnutChartData(this.orderData);
      }));

    this.orderService.getCompletedOrders(this.retailerEmail).subscribe(data =>
      this.zone.run(() => {
        console.log(data);
        this.deliveredOrders = data.length;
      }));

    this.orderService.getPendingOrders(this.retailerEmail).subscribe(data =>
      this.zone.run(() => {
        console.log(data);
        this.pendingOrders = data.length;
      }));

    this.rentedVehicleService.getBookedVehicles().subscribe(data => {
      this.zone.run(() => {
        console.log(data);
        this.rentedVehicles = data;
      })
    })
  }

  populateLineChartData(orderData) {
    let uniqueDates = orderData.reduce(function (a, d) {
      if (a.indexOf(d.deliveryDate) === -1) {
        a.push(d.deliveryDate);
      }
      return a;
    }, []);

    for (var i = 0; i < uniqueDates.length; i++) {
      let count = orderData.reduce((acc, cur) => cur.deliveryDate === uniqueDates[i] ? ++acc : acc, 0);
      this.totalOrdersPerDay.push(count);
      this.orderDates.push(uniqueDates[i]);
    }

    console.log(this.orderDates);
    console.log(this.totalOrdersPerDay);

    this.lineChartData = [{data: this.totalOrdersPerDay, label: 'Number of orders'}];
    this.lineChartLabels = this.orderDates;
  }

  populateDoughnutChartData(orderData) {
    this.doughnutChartData.push(orderData.reduce((acc, cur) => cur.slotNumber === "slot1" ? ++acc : acc, 0));
    this.doughnutChartData.push(orderData.reduce((acc, cur) => cur.slotNumber === "slot2" ? ++acc : acc, 0));
    this.doughnutChartData.push(orderData.reduce((acc, cur) => cur.slotNumber === "slot3" ? ++acc : acc, 0));
  }

  retailervehicleDemand() {
    this.router.navigate(['retailerVehicleDemand']);
  }
}
