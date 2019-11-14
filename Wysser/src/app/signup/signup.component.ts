import { GetlistService } from './../getlist.service';
import { Component, OnInit } from '@angular/core';
// const bcrypt = require('bcrypt');
<<<<<<< HEAD
=======

>>>>>>> 2e126f5af77bfea665beede4ba8819e881ce674e




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
  
<<<<<<< HEAD
  //var hash = bcrypt.hashSync(pass, 10);
    this.serv.postLists(email,mobile,pass).subscribe();
=======
  // var hash = bcrypt.hashSync(pass, 10);
  //   this.serv.postLists(email,mobile,hash).subscribe();
  //   console.log(hash);

>>>>>>> 2e126f5af77bfea665beede4ba8819e881ce674e

  }

}
