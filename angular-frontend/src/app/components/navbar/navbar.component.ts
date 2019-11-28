import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  checkLogin;

  constructor() { 
    this.checkLogin = localStorage.getItem('token');
  }

  ngOnInit() {
  }


  // for clearing local storage as logout button pressed
  validateLogout(){
    console.log("loging out");
    
    localStorage.removeItem('token');

    this.checkLogin = null;

  }
  


}
