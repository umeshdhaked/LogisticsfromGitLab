import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class LoginAuthService {


  constructor(private httpclient: HttpClient) {
  }


  getToken(data) {

    let url = environment.apiUrl + ':9091/token/generate';

    return this.httpclient.post(url, data)


  }


  isUserLoggedIn() {
    let checkLogin = localStorage.getItem('token')  //we need to verify this token we can't blindly allow any string
    //console.log(!(user === null))
    return !(checkLogin === null)
  }

  logOut() {
    localStorage.removeItem('token')
  }



}
