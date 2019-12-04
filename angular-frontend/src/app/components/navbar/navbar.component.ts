
import {Component, OnInit} from '@angular/core';
import { Location } from '@angular/common';
import { RouterModule, Router, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  checkLogin;
  hideElement = false;

  constructor(private router: Router) {
    this.checkLogin = localStorage.getItem('token');
    this.router.events.subscribe((event) => {
      if (event instanceof NavigationEnd) {
        if (event.url === '/login') {
          this.hideElement = true;
        }  else {
          this.hideElement = false;
        }
      }
    });
  }

  ngOnInit() {
  }


  // for clearing local storage as logout button pressed
  validateLogout() {
    console.log("loging out");

    localStorage.removeItem('token');

    this.checkLogin = null;

  }


}
