import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {SignatureDetails} from "../interfaces/signature";

@Injectable({
  providedIn: 'root'
})
export class SignatureService {
  private url = 'http://localhost:9095/save';
  constructor(private http: HttpClient) { }
  sendSignatureRequest(details: SignatureDetails) {
    return this.http.post(this.url, details, {
      responseType: 'text'
    });
  }
}
