import { GetlistService } from './../getlist.service';
import { Component, OnInit } from '@angular/core';
const bcrypt = require('bcrypt');





@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  private value;
  constructor(private serv : GetlistService) { }

  ngOnInit() {
  }

  submit(email,mobile,pass)
  {
    
  console.log(pass);
  
  var hash = bcrypt.hashSync(pass, 10);
    this.serv.postLists(email,mobile,hash).subscribe();
    console.log(hash);



  

  }

}
