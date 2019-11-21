import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EditProfileService {

  constructor(public http: HttpClient) { }

   public saveRetailerData(data){

    setTimeout(() => {
      
        this.http.post('http://localhost:8082/retailerProfile/saveDetailOfRetailer', data ).subscribe();
        alert('Profile Saved');

    }, 350);


   }


}
