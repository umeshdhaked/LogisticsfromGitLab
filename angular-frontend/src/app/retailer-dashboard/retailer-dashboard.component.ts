import { Component, OnInit, NgZone } from '@angular/core';
import { OrderServiceService } from '../services/order-service.service';
import { ChartDataSets, ChartOptions, ChartType } from 'chart.js';
import { Color, Label, MultiDataSet } from 'ng2-charts';

@Component({
  selector: 'app-retailer-dashboard',
  templateUrl: './retailer-dashboard.component.html',
  styleUrls: ['./retailer-dashboard.component.css']
})
export class RetailerDashboardComponent implements OnInit {

  orderData = [];
  pendingOrders: number = 0;
  deliveredOrders: number = 0;

  totalOrdersPerDay = []
  orderDates = []

  //line chart data
  lineChartData: ChartDataSets[] = [];
  lineChartLabels: Label[] =[];
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

  constructor(private orderService: OrderServiceService, private zone:NgZone) { }

  ngOnInit() {
    this.orderService.getAllOrderData().subscribe(data =>
      this.zone.run(() => 
      {
        this.orderData = data;
        this.populateLineChartData(this.orderData);
        this.populateDoughnutChartData(this.orderData);
      }));

    this.orderService.getCompletedOrders().subscribe(data =>
      this.zone.run(() => 
      {
        console.log(data);
        this.deliveredOrders = data.length;
      }));
    
      this.orderService.getPendingOrders().subscribe(data =>
        this.zone.run(() => 
        {
          console.log(data);
          this.pendingOrders = data.length;
        }));  
  }

  populateLineChartData(orderData){
    let uniqueDates = orderData.reduce(function (a, d) {
      if (a.indexOf(d.deliveryDate) === -1) {
        a.push(d.deliveryDate);
      }
      return a;
    }, []);

    for(var i = 0; i < uniqueDates.length; i++){
      let count = orderData.reduce((acc, cur) => cur.deliveryDate === uniqueDates[i] ? ++acc : acc, 0);
      this.totalOrdersPerDay.push(count);
      this.orderDates.push(uniqueDates[i]);
    }

    console.log(this.orderDates);
    console.log(this.totalOrdersPerDay);

    this.lineChartData = [{data: this.totalOrdersPerDay, label: 'Number of orders'}];
    this.lineChartLabels = this.orderDates;
  }

  populateDoughnutChartData(orderData){
    this.doughnutChartData.push(orderData.reduce((acc, cur) => cur.slotNumber === "slot1" ? ++acc : acc, 0));
    this.doughnutChartData.push(orderData.reduce((acc, cur) => cur.slotNumber === "slot2" ? ++acc : acc, 0));
    this.doughnutChartData.push(orderData.reduce((acc, cur) => cur.slotNumber === "slot3" ? ++acc : acc, 0));
  }
}
