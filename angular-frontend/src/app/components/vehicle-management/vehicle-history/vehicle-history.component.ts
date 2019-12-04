import {Component, OnInit} from '@angular/core';
import * as CanvasJS from '../../../../assets/js/canvasjs.min';
import { style } from '@angular/animations';

@Component({
  selector: 'app-vehicle-history',
  templateUrl: './vehicle-history.component.html',
  styleUrls: ['./vehicle-history.component.css']
})
export class VehicleHistoryComponent implements OnInit {


  ngOnInit() {
		let chart = new CanvasJS.Chart("chartContainer", {
		animationEnabled: true,
		exportEnabled: true,
		title: {
			text: "Vehicle History"
		},
		data: [{
			type: "column",
			dataPoints: [
				{ y: 71, label: "Bike" },
				{ y: 55, label: "Car" },
				{ y: 50, label: "Truck" },
				{ y: 40, label: "Van" },

			]
		}]
	});
		
	chart.render();
    }
}

//   constructor() {
//   }

//   ngOnInit() {
//   }

// }
