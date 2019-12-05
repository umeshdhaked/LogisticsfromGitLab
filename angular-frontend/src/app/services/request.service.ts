import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { from } from 'rxjs';
import { Message } from '../interfaces/message';

@Injectable({
  providedIn: 'root'
})
export class RequestService {

  constructor(public http: HttpClient) { }

  findallrequested(): Observable<any> {
    // const url =  'http://172.23.239.62:9090/findAll';

    const url = environment.apiUrl + ':9090/findAll';
    return this.http.get(url);
  }

  sendAccept(input:any): Observable<Message>{
    const uri = environment.apiUrl + ':8095/api/v1/Accept';
   return this.http.post<Message>(uri, input);
  }

  sendAccepttovehicledemand(input:any){
    const uri = environment.apiUrl + ':9090/saveacceptedstatusdemand';
   return this.http.post(uri, input);
  }
  deleteinretailerdemand(id:number){
    const uri= environment.apiUrl + ':9090/deletedemand/'+ id;
    return this.http.delete(uri);
  }

  sendReject(input){

    const uri = environment.apiUrl + ':8095/api/v1/Reject';
    return this.http.post(uri, input);

  }

  sendRejecttovehicledemand(input:any){
    const uri = environment.apiUrl + ':9090/saverejectedstatusdemand';
   return this.http.post(uri, input);
  }



}
