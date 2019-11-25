import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private http: HttpClient) { }

  registerNewUser(firstName, lastName, email): Observable<String>{
    let uri = environment.apiUrl + ":8088/register";
    let data = {"firstName": firstName, "lastName": lastName, "email": email};
    return this.http.post<String>(uri, JSON.stringify(data),{headers:{'Content-Type': 'application/json', 'Access-Control-Allow-Origin':'*'}});
  }
}
