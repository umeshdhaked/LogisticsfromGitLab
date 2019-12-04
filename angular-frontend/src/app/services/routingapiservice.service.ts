import { Injectable } from '@angular/core';
import {forkJoin, Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class RoutingapiserviceService {
  API_KEY = 'Am645nTS2rVqgDNr8UDKqZPdOL-X2_Z94sS5-GqjNBcoMfSOi_dVC6KTDGxL_jDb';
  // addresses = ['koramangala', 'marathahalli'];
  responses = [];
  waypoints = [];
  constructor(private httpclient: HttpClient) { }
  public getLatandLong(address): Observable<any> {
    for (let i = 0; i < address.length; i++) {
      this.responses[i] = this.httpclient.get('http://dev.virtualearth.net/REST/v1/Locations?query=' + address[i] + '&includeNeighborhood=1&include=1&maxResults=5&key=' + this.API_KEY,
      );
    }
    return forkJoin(this.responses);
    // return this.httpclient.get<namespace.Point[]>('http://dev.virtualearth.net/REST/v1/Locations?query='+address+'&includeNeighborhood=1&include=1&maxResults=5&key='+this.API_KEY);
  }
  public getGeoJsonLatLOng(coordinates, address) {
    for (let i = 0; i < address.length - 1; i++) {
      // this.waypoints[i]=this.httpclient.get('https://api.mapbox.com/directions/v5/mapbox/cycling/'+coordinates[i][0]+','+coordinates[i][1]+';'+coordinates[i+1][0]+','+coordinates[i+1][1]+'?steps=true&geometries=geojson&access_token=pk.eyJ1IjoiZ2F1dGhhbTk5IiwiYSI6ImNrMzRlMmxrNjE0ZTMzbXBhOWRwdDk1eTcifQ.-ZceQ8jARpf90y0tJnQhoQ');
      this.waypoints[i] = this.httpclient.get('http://dev.virtualearth.net/REST/V1/Routes?wp.0=' + coordinates[i][0] + ', ' + coordinates[i][1] + '&wp.1=' + coordinates[i + 1][0] + ',' + coordinates[i + 1][1] + '&optmz=distance&routeAttributes=routePath&key=Am645nTS2rVqgDNr8UDKqZPdOL-X2_Z94sS5-GqjNBcoMfSOi_dVC6KTDGxL_jDb',
      );
      // let url = 'http://dev.virtualearth.net/REST/V1/Routes?wp.0=' + coordinates[i][0] + ', ' + coordinates[i][1] + '&wp.1=' + coordinates[i + 1][0] + ',' + coordinates[i + 1][1] + '&optmz=distance&routeAttributes=routePath&key=Am645nTS2rVqgDNr8UDKqZPdOL-X2_Z94sS5-GqjNBcoMfSOi_dVC6KTDGxL_jDb';
      // this.waypoints[i] = this.httpclient.jsonp(url, "callback");
    }
    return forkJoin(this.waypoints);
  }
}
