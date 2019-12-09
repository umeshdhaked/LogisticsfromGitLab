import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-driver-login',
  templateUrl: './driver-login.component.html',
  styleUrls: ['./driver-login.component.css']
})
export class DriverLoginComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  username: any;
  password: any;

  checkLogin(){
    //check login details with vehicle company
    if(this.username == "1" && this.password == "abcde"){
      localStorage.setItem("vehicleId",this.username);
      this.router.navigateByUrl('driverdashboard');
    } else {
      alert('please enter correct username and password');
    }
  }
}
