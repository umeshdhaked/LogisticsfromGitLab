import { Injectable } from '@angular/core';
import {RetailerDetails} from "./vehicledemanded";
import {HttpClient} from "@angular/common/http";
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class VehicledemandfrontendService {
  private url = environment.apiUrl +':9090/save';

  constructor(private http: HttpClient) { }
  sendRetailerRequest(details: RetailerDetails) {
    return this.http.post(this.url, details, {
      responseType: 'text'
    });
  }
}
