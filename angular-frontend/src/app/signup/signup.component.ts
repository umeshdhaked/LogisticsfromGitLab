import { GetlistService } from './../getlist.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

var bcrypt = require('bcryptjs');

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  private notmatch;
  private value;
  constructor(private serv : GetlistService, private router:Router) {
   }

  ngOnInit() {
  }

  submit(email,mobile,pass,confPass)
  {


    if(pass === confPass){

      var salt = bcrypt.genSaltSync(10);
      var hashedPass = bcrypt.hashSync(pass, salt);

      this.serv.postLists(email,mobile,hashedPass).subscribe();


    }
    else{
      this.router.navigate(['/signup']);
      alert('Passwords are not matching')
    }

   
  }

}
