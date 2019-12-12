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
			text: "Accepted Vehicle"
		},
		data: [{
			type: "column",
			dataPoints: [
				{ y: 71, label: "KA110" },
				{ y: 55, label: "KA111" },
				{ y: 50, label: "KA112" },
				{ y: 65, label: "KA113" },
				{ y: 40, label: "KA114" },
				{ y: 20, label: "KA115" },
				{ y: 30, label: "KA116" },
				{ y: 75, label: "KA117" },
				{ y: 25, label: "KA118" },
				

			]
		}]
	});
		
	 chart.render();

  
	let chart1 = new CanvasJS.Chart("chartContainer1", {
		theme: "light2",
		animationEnabled: true,
		exportEnabled: true,
		title:{
			text: "Vehicles"
		},
		data: [{
			type: "pie",
			showInLegend: true,
			toolTipContent: "<b>{name}</b>: {y} (#percent%)",
			indexLabel: "{name} - #percent%",
			dataPoints: [
				{ y: 450, name: "Bike" },
				{ y: 400, name: "Car" },
				{ y: 300, name: "Truck" },
				{ y: 100, name: "Van" },
				
			
			]
		}]
	});
		
	chart1.render();
    }



    }


//   constructor() {
//   }

//   ngOnInit() {
//   }

// }
