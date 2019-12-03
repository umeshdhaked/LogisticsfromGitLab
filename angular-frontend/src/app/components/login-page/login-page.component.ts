import {Component, OnInit} from '@angular/core';
import {LoginAuthService} from 'src/app/services/login-auth.service';
import * as jwt_decode from 'jwt-decode';
import {Router} from '@angular/router';
import { DecodedJwtData } from 'src/app/interfaces/decoded-jwt-data';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  jwtTokenObj = {
    "token": ""
  }

  token;


  constructor(private loginAuthService: LoginAuthService, private router: Router) {
  }

  ngOnInit() {
  }


  loginMessage = '';

  validateLogin(email, password) {

    var loginData = {
      "email": email,
      "password": password
    }

    var decodedDetail:DecodedJwtData;

    // getting jwtToken from backend and storing it in localstorage

    this.loginAuthService.getToken(loginData).subscribe((datas: any) => {
      this.jwtTokenObj = datas;

      if (this.jwtTokenObj != null) {
        this.token = this.jwtTokenObj.token;  //getting token string from json if it's not NULL

        localStorage.setItem('token', this.token);  // soring token in local storage

        console.log(this.token);


        decodedDetail = jwt_decode(this.token);   // decoding token into json objects
        console.log(decodedDetail);
        console.log(decodedDetail.sub);

        if(decodedDetail.role === "Retailer")
        this.router.navigate(['/viewProfile']);
        if(decodedDetail.role === "VehicleCompany")
        this.router.navigate(['/manage-vehicle']);

      } else {
        this.loginMessage = 'UserName or Password is incorrect';
      }

    });


  }


}
