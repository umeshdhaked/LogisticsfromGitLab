import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Router} from '@angular/router';
import {EditProfileService} from '../../services/edit-profile.service';
import * as jwt_decode from 'jwt-decode';

@Component({
  selector: 'app-edit-profile',
  templateUrl: './edit-profile.component.html',
  styleUrls: ['./edit-profile.component.css']
})
export class EditProfileComponent implements OnInit {


  email = '';

  constructor(private httpClient: HttpClient, private router: Router, private editProfileService: EditProfileService) {
  }

  ngOnInit() {


    // getting email from token
    var decoded = {
      "sub": ""
    }
    let token = localStorage.getItem('token');


    if (token != null) {
      decoded = jwt_decode(token);
      this.email = decoded.sub;
    }


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


  public save(fullName, phone, address, gstIn, docName, check) {

    if (!check) {
      alert('Please check terms and condition');
      this.router.navigate(['/editProfile']);
    } else if (fullName === "" || this.email === "" || phone === "" || address === "" || gstIn === "") {
      alert('fill all the fields');
      this.router.navigate(['/editProfile']);
    } else if (docName === "none") {
      alert('Select a document');
      this.router.navigate(['/editProfile']);
    } else {
      var retailerData = {
        "fullName": fullName,
        "email": this.email,
        "phoneNo": phone,
        "address": address,
        "gstIn": gstIn,
        "docName": docName,
        // "profilePic":this.url,
        // "docPic":this.docurl,
      }

      var retailerDataString = JSON.stringify(retailerData);  //converting json to string

      let formData = new FormData();
      formData.append('profilePic', this.picFile, this.picFile.name);
      formData.append('docPic', this.docFile, this.docFile.name);
      formData.append('retailer', retailerDataString);


      this.editProfileService.saveRetailerData(formData);

      // window.location.reload();
      this.router.navigate(['/viewProfile']);


    }

    this.delete();


  }
}
