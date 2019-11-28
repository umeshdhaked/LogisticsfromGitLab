import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class LoginAuthService {


  constructor(private httpclient: HttpClient) { }


  
  getToken(data) {

    let url = environment.apiUrl+':8084/token/generate';

  return this.httpclient.post(url, data)

  
  
  }

}
