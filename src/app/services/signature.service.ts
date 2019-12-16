import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { SignatureDetails } from '../interfaces/signature';

@Injectable({
  providedIn: 'root'
})
export class SignatureService {

  private url = environment.apiUrl + ':9095/save';
  constructor(private http: HttpClient) { }
 public sendSignatureRequest(details: SignatureDetails) {
    return this.http.post(this.url, details, {
      responseType: 'text'
    });
  }


}
