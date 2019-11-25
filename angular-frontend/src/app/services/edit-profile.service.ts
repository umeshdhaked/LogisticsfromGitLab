import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class EditProfileService {

  constructor(public http: HttpClient) { }

   public saveRetailerData(data){

    setTimeout(() => {

      let url = environment.apiUrl + ":8082/retailerProfile/saveDetailOfRetailer"
        this.http.post(url, data ).subscribe();
        alert('Profile Saved');

    }, 350);


   }


}
