import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { VechicleCompanyServiceService } from 'src/app/services/vechicle-company-service.service';
import * as jwt_decode from 'jwt-decode';
import { DecodedJwtData } from 'src/app/interfaces/decoded-jwt-data';

@Component({
  selector: 'app-vehicle-company-profile',
  templateUrl: './vehicle-company-profile.component.html',
  styleUrls: ['./vehicle-company-profile.component.css']
})
export class VehicleCompanyProfileComponent implements OnInit {

  constructor(private router:Router, private vehicleCompanyService:VechicleCompanyServiceService ) { }


  dataFromToken:DecodedJwtData;
  vehicleCompanyData;


  ngOnInit() {
    if(localStorage.getItem('token')!=null){
      this.dataFromToken= jwt_decode(localStorage.getItem('token'))
    }

    this.vehicleCompanyService.getVehicleCompanyProfileFromEmail(this.dataFromToken.sub).subscribe( (data:any) =>{
      this.vehicleCompanyData = data;
      console.log(data);
    })

  }


  private save(companyName,contact,address,gst){

    console.log('vehicle company data');
    console.log(companyName+'--'+contact+'-'+address+'-'+gst);


    var companyData = {
        "id": this.dataFromToken.userId,
        "companyName": companyName,
        "contact": contact,
        "address": address,
        "gst": gst,
        "email": this.dataFromToken.sub
    }

    this.vehicleCompanyService.saveVehicleCompanyProfile(companyData);

      this.router.navigate(['/vehicle-management']);
  }


}
