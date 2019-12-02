import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from 'src/environments/environment';
import {Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class EditProfileService {

  constructor(public http: HttpClient) {
  }

  public saveRetailerData(data) {

    const url = environment.apiUrl + ':8082/retailerProfile/saveDetailOfRetailer';
    // console.log(url);
    console.log('profile data = ');
    console.log(data);

    setTimeout(() => {
      this.http.post(url, data).subscribe();
      alert('Profile Saved');
    }, 350);


  }



  public getProfileFromEmail(data) {

    const url = environment.apiUrl + ':8082/retailerProfile/getRetailerFromEmail?email=' + data;

    return this.http.get(url);

  }
 public getAllRetailer(): Observable<any> {
    const url = environment.apiUrl + '8082/retailerProfile/getAllRetailersProfileList';
    return this.http.get(url);
 }

}
