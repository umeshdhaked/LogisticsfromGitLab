import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class VechicleCompanyServiceService {

  constructor(private http:HttpClient) { }

  public getVehicleCompanyProfileFromEmail(email){
    let url = environment.apiUrl+':8082/vehicleCompanyProfile/getProfile?email='+email;
  
    return this.http.get(url);
  }

  public saveVehicleCompanyProfile(dataObj){
    let url = environment.apiUrl + ':8082:/vehicleCompanyProfile/saveVehicleCompanyDetail';
    this.http.post(url,dataObj).subscribe();
  }


}
