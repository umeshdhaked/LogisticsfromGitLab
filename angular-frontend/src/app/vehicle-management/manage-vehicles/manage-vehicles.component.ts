import { Component, OnInit } from '@angular/core';
import { Vehicle } from '../../interfaces/vehicle';
import { VehicleService } from '../../services/vehicle.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-manage-vehicles',
  templateUrl: './manage-vehicles.component.html',
  styleUrls: ['./manage-vehicles.component.css']
})
export class ManageVehiclesComponent implements OnInit {

  vehicles: Vehicle[];
  vehicleForm: boolean = false;
  isNewVehicle: boolean;
  newVehicle: any = {};
  editVehicleForm: boolean = false;
  editedVehicle: any = {};
  constructor(private vehicleService: VehicleService, private router:Router) { }

  ngOnInit() {    

    this.vehicleService.getAllVehicles().subscribe(data =>{
      this.vehicles = data;
    });  
  }

  getVehicles(): Vehicle[] {
    return this.vehicleService.getVehiclesFromData();
  }


  showEditVehicleForm(vehicle: Vehicle) {
    if (!vehicle) {
      this.vehicleForm = false;
      return;
    }
    this.editVehicleForm = true;
    this.editedVehicle = vehicle;
  }

  showAddVehicleForm() {
    // resets form if edited vehicle
    if (this.vehicles.length) {
      this.newVehicle = {};
    }
    this.vehicleForm = true;
    this.isNewVehicle = true;

  }

  saveVehicle(vehicle: Vehicle) {
    if (this.isNewVehicle) {
      //add a new vehicle
      this.vehicleService.addVehicle(vehicle);
    }
    this.vehicleForm = false;
    this.vehicles.push(vehicle);
  }

  updateVehicle() {
    this.vehicleService.updateVehicle(this.editedVehicle);
    this.editVehicleForm = false;
    this.editedVehicle = {};
  }

  removeVehicle(vehicle: Vehicle) {
    this.vehicleService.deleteVehicle(vehicle);
    location.reload();
  }

  cancelEdits() {
    this.editedVehicle = {};
    this.editVehicleForm = false;
  }

  cancelNewVehicle() {
    this.newVehicle = {};
    this.vehicleForm = false;
  }
}


  
