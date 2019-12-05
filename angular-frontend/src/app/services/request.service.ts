import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { from } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RequestService {

  constructor(public http: HttpClient) { }

  findallrequested(): Observable<any> {
    const url = environment.apiUrl + ':9090/findAll';

    return this.http.get(url);
  }

  sendAcceptRequest(input){
    const uri = environment.apiUrl + ':8095/api/v1/Accept';
   return this.http.post(uri, input);
  }



}
