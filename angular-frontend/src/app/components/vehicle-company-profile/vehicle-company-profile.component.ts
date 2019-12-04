import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vehicle-company-profile',
  templateUrl: './vehicle-company-profile.component.html',
  styleUrls: ['./vehicle-company-profile.component.css']
})
export class VehicleCompanyProfileComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }


  private save(companyName,contact,address,gst){

    console.log('vehicle company data');
    console.log(companyName+'--'+contact+'-'+address+'-'+gst);
  }


}
