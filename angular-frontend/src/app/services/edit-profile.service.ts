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

      // let url = environment.apiUrl + ":8082/retailerProfile/saveDetailOfRetailer"


      console.log(data);

        this.http.post('http://localhost:8082/retailerProfile/saveDetailOfRetailer', data ).subscribe();
        alert('Profile Saved');
    }, 350);


   }




   public getPic(data){

      // let url = environment.apiUrl + ":8082/retailerProfile/saveDetailOfRetailer"

       return this.http.get('http://localhost:8082/retailerProfile/getPic?email='+data);
  
   }






}
