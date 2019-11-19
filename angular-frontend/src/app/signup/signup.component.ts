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
      var hashed = bcrypt.hashSync(pass, salt);

      console.log('pass = '+hashed);


    }
    else{
      this.router.navigate(['/signup']);
      alert('password is not matching')
    }


  

    this.serv.postLists(email,mobile,pass).subscribe();


    this.serv.postLists(email,mobile,pass).subscribe();
   
  }

}
