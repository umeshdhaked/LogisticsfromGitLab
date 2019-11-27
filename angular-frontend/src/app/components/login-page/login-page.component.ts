import { Component, OnInit } from '@angular/core';
import { LoginAuthService } from 'src/app/services/login-auth.service';
import * as jwt_decode from 'jwt-decode';

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


  constructor(private loginAuthService: LoginAuthService) {
   }

  ngOnInit() {
  }

  validateLogin(email, password, role) {

    var loginData = {
      "id": 25,
      "email": email,
      "pass": password,
      "role": role
    }

    var decoded = {
      "sub":"",
      "role":""
    }


    // getting jwtToken from backend and storing it in localstorage 

    this.loginAuthService.getToken(loginData).subscribe((datas: any) => {
      this.jwtTokenObj = datas;
  
      if(this.jwtTokenObj != null){
      this.token = this.jwtTokenObj.token;  //getting token string if it's not NULL
  
      localStorage.setItem('token',this.token);  // soring token in local storage
  
      console.log(this.token);

      

       decoded = jwt_decode(this.token);   // decoding token into json objects
       console.log(decoded);
       console.log(decoded.sub+' '+decoded.role);
      }

    });
  


  }

  
// for clearing local storage as logout button pressed
  validateLogout(){
    console.log("loging out");
    
    localStorage.removeItem('token');

  }


}
