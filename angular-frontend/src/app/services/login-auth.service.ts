import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class LoginAuthService {


  constructor(private httpclient: HttpClient) { }


  
  getToken(data) {

    let url = 'http://localhost:8084/token/generate';

  return this.httpclient.post(url, data)

  
  
  }

}
