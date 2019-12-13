import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from '../../environments/environment';
// import * as url from "url";

@Injectable({
  providedIn: 'root'
})
export class CareerService {
  private httpOptionsNoAuth: { headers: HttpHeaders };

  constructor(private http: HttpClient) {
    this.httpOptionsNoAuth = {
      // headers: new HttpHeaders(),
      headers: new HttpHeaders().append('Access-Control-Allow-Origin', '*')
    };
    // this.httpOptionsNoAuth.headers = this.httpOptionsNoAuth.headers.append('X-FD-FLIGHT', 'null');
  }

  sendDataOfCareer(data: any) {
  const  url = environment.apiUrl + ':9500/saveNewCareerRequest';
  return this.http.post(url, data, {headers: this.httpOptionsNoAuth.headers});
  }
   getDataFromCareer() {
    const url = environment.apiUrl + ':9500/getAllCareerRequestList';
    return this.http.get(url);
   }
}
