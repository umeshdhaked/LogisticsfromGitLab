import { Component, OnInit } from '@angular/core';
import { EditProfileService } from '../../services/edit-profile.service';
import * as jwt_decode from 'jwt-decode';

@Component({
  selector: 'app-view-profile',
  templateUrl: './view-profile.component.html',
  styleUrls: ['./view-profile.component.css']
})
export class ViewProfileComponent implements OnInit {

  retailerObj = {
    "fullName":"",
    "email":"",
    "phoneNo":"",
    "address":"",
    "gstIn":"",
    "docName":"",
    "profilePic":"",
    "profilePicType":"",
    "docPic":"",
    "docPicType":"",
  }



  picurl = '';
  docurl = '';
  constructor(private editProfileService:EditProfileService) {}

  ngOnInit() {

    // getting email from token
    var decoded = {
      "sub":""
    }
   let token = localStorage.getItem('token');
   let email = '';

   if(token != null){
    decoded = jwt_decode(token);
      email = decoded.sub;
   }


// finding profile detail from email

    this.editProfileService.getProfileFromEmail(email).subscribe((datas:any)=> {
      this.retailerObj = datas;
      this.picurl = 'data:'+this.retailerObj.profilePicType+';base64,'+this.retailerObj.profilePic;
      this.docurl = 'data:'+this.retailerObj.docPicType+';base64,'+this.retailerObj.docPic;
      // console.log(this.retailerObj.fullName);
      });
  }







}
