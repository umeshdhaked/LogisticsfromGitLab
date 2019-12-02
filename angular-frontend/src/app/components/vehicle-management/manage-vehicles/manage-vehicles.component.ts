import {Component, OnInit} from '@angular/core';
import {VehicleService} from '../../../services/vehicle.service';
import {Router} from '@angular/router';
import {VehicleManagement} from 'src/app/interfaces/vehicle-management';
import {MatTableDataSource} from '@angular/material/table';
import {BehaviorSubject} from 'rxjs';

@Component({
  selector: 'app-manage-vehicles',
  templateUrl: './manage-vehicles.component.html',
  styleUrls: ['./manage-vehicles.component.css']
})
export class ManageVehiclesComponent implements OnInit {

  vehicles: VehicleManagement[];
  vehicleForm: boolean = false;
  isNewVehicle: boolean;
  newVehicle: any = {};
  editVehicleForm: boolean = false;
  editedVehicle: any = {};
  filteredData: VehicleManagement[];

  constructor(private vehicleService: VehicleService, private router: Router) {
  }

  vehicleBehavior: BehaviorSubject<any>;

  set searchTerm(value: string) {
    this.filteredData = this.vehicles.filter((vehicle) => {
      return ((vehicle.slot.toString().toLowerCase().indexOf(value.toLowerCase()) != -1) ||
      (vehicle.date.toString().toLowerCase().indexOf(value.toLowerCase()) != -1) ||
        (vehicle.id.toString().toLowerCase().indexOf(value.toLowerCase()) != -1) ||
        (vehicle.vehicleType.toString().toLowerCase().indexOf(value.toLowerCase()) != -1) ||
        (vehicle.driverName.toString().toLowerCase().indexOf(value.toLowerCase()) != -1) ||
        (vehicle.vehicleNumber.toString().toLowerCase().indexOf(value.toLowerCase()) != -1) ||
        (vehicle.capacity.toString().toLowerCase().indexOf(value.toLowerCase()) != -1) ||
        (vehicle.costPerSlot.toString().toLowerCase().indexOf(value.toLowerCase()) != -1) ||
        (vehicle.vehicleStatus.toString().toLowerCase().indexOf(value.toLowerCase()) != -1));
    });
    console.log(this.filteredData);
  }


  // displayedColumns: string[] = ['id', 'vehicleNumber', 'driverName','vehicleType','capacity','costPerSlot', 'vehicleStatus'];
  // dataSource = new MatTableDataSource(this.vehicles);

  // applyFilter(filterValue: string) {
  //   this.dataSource.filter = filterValue.trim().toLowerCase();
  // }


  ngOnInit() {
    this.vehicleService.getAllVehicles().subscribe(data => {
      this.vehicles = data
      this.filteredData = data;
    });

  }

  getVehicles(): VehicleManagement[] {
    return this.vehicleService.getVehiclesFromData();
  }


  showEditVehicleForm(vehicle: VehicleManagement) {
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

  saveVehicle(vehicle: VehicleManagement) {
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

  removeVehicle(vehicle: VehicleManagement) {
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



