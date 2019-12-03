import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Router} from '@angular/router';
import {EditProfileService} from '../../services/edit-profile.service';
import * as jwt_decode from 'jwt-decode';
import { Retailerdetails } from 'src/app/interfaces/retailerDetails';
import { DecodedJwtData } from 'src/app/interfaces/decoded-jwt-data';
import { stringify } from 'querystring';

@Component({
  selector: 'app-edit-profile',
  templateUrl: './edit-profile.component.html',
  styleUrls: ['./edit-profile.component.css']
})
export class EditProfileComponent implements OnInit {

  constructor(private httpClient: HttpClient, private router: Router, private editProfileService: EditProfileService) {
  }

  decodedData:DecodedJwtData;
  retailerObj:Retailerdetails;

  ngOnInit() {

    let token = localStorage.getItem('token');

    if (token != null) {
     this.decodedData = jwt_decode(token);
    }

    this.editProfileService.getProfileFromEmail(this.decodedData.sub).subscribe((datas: any) => {
      this.retailerObj = datas;
    });

  }


  // Methods Stats from here................................


  // fileData: File = null;
  // previewUrl:any = null;
  // fileUploadProgress: string = null;
  // uploadedFilePath: string = null;


  // fileProgress(fileInput: any) {
  //   this.fileData = <File>fileInput.target.files[0];
  //   this.preview();


  //   this.onSelectDoc(fileInput);
  // }

  // // show preview of uploaded file in the browser
  // preview() {
  //   var mimeType = this.fileData.type;
  //   if (mimeType.match(/image\/*/) == null) {
  //     return;
  //   }
  //   var reader = new FileReader();
  //   reader.readAsDataURL(this.fileData);
  //   reader.onload = (event) => {
  //     this.previewUrl = reader.result;
  //   }
  // }


  // for set url of Profile image
  public picFile;
  picUrl = '';

  onSelectPicture(event) {
    this.picFile = event.target.files[0];
    if (event.target.files && event.target.files[0]) {
      var reader = new FileReader();

      reader.readAsDataURL(event.target.files[0]); // read file as data url

      reader.onload = (event) => {               // called once readAsDataURL is completed
        let target: any = event.target;
        this.picUrl = target.result;
      }
    }

  }


// for set url of document image
  public docFile;
  docurl = '';

  onSelectDoc(event) {

    this.docFile = event.target.files[0];


    if (event.target.files && event.target.files[0]) {
      var reader = new FileReader();

      reader.readAsDataURL(event.target.files[0]); // read file as data url

      reader.onload = (event) => {               // called once readAsDataURL is completed
        let target: any = event.target;
        this.docurl = target.result;
      }
    }

  }


  public delete() {
    this.docurl = null;
    this.picUrl = null;

  }


    // retailerData:Retailerdetails;
  public save(fullName, phone, address, gstIn, docName, check) {

    if (!check) {
      alert('Please check terms and condition');
      this.router.navigate(['/editProfile']);
    } else if (fullName === "" || phone === "" || address === "" || gstIn === "") {
      alert('fill all the fields');
      this.router.navigate(['/editProfile']);
    } else if (docName === "none") {
      alert('Select a document');
      this.router.navigate(['/editProfile']);
    } else {
      
      var retailerData = {     
        "id" : this.decodedData.userId,
        "fullName" : fullName,
        "email" : this.decodedData.sub,
        "phoneNo" : phone,
        "address" : address,
        "gstIn" : gstIn,
        "docName" : docName
        // "profilePic":this.url,
        // "docPic":this.docurl,
      };

      // this.retailerData = {
      // id :   this.decodedData.userId,
      // firstName: "",
      // lastName: "",
      // age: "",
      // emergencyContact: "",
      // dateOfBirth: "",
      // placeOfBirth: "",
      // gstIn: "",
      // permanentAddress: "",
      // shopAddress: "",
      // mobileNo: "",
      // fullName: fullName,
      // email: this.decodedData.sub,
      // phoneNo: phone,
      // address: address,
      // docName: docName,
      // profilePic: "",
      // profilePicType: "",
      // docPic: "",
      // docPicType: "",

      // }

      

      var retailerDataString = JSON.stringify(retailerData);  //converting json to string

      let formData = new FormData();
      formData.append('profilePic', this.picFile, this.picFile.name);
      formData.append('docPic', this.docFile, this.docFile.name);
      formData.append('retailer', retailerDataString);


      this.editProfileService.saveRetailerData(formData);

      this.router.navigate(['/user']);

    }

    this.delete();


  }
}
