import { Component, OnInit } from '@angular/core';
import { HttpClient } from  '@angular/common/http';
import { Router } from '@angular/router';
import { EditProfileService } from '../services/edit-profile.service';


@Component({
  selector: 'app-edit-profile',
  templateUrl: './edit-profile.component.html',
  styleUrls: ['./edit-profile.component.css']
})
export class EditProfileComponent implements OnInit {


  constructor(private http: HttpClient, private router:Router, private editProfileService:EditProfileService) { }
  ngOnInit( ) {}

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
  url = '';
  onSelectPicture(event) {

    console.log('helloFile')
    if (event.target.files && event.target.files[0]) {
      var reader = new FileReader();

      reader.readAsDataURL(event.target.files[0]); // read file as data url

      reader.onload = (event) => {               // called once readAsDataURL is completed
        let target: any = event.target;
        this.url = target.result;
      }
    }
  
  }

// for set url of document image
  docurl = '';
  onSelectDoc(event) {

     if (event.target.files && event.target.files[0]) {
      var reader = new FileReader();

      reader.readAsDataURL(event.target.files[0]); // read file as data url

      reader.onload = (event) => {               // called once readAsDataURL is completed
        let target: any = event.target;
        this.docurl = target.result;
      }
    }

  }





  public delete(){

    this.docurl = null;
    this.url = null;
  }


  public save(fullName,email,phone,address,gstIn,docName,check){
   
    if(!check){
      alert('Please check terms and condition');
      this.router.navigate(['/editProfile']);
    }

    if(fullName==="" || email === "" || phone ==="" || address===""||gstIn===""){
      alert('fill all the fields');
      this.router.navigate(['/editProfile']);      
    }

    if(docName==="none"){
      alert('Select a document');
      this.router.navigate(['/editProfile']);
    }



    var retailerData = {
      "fullName":fullName,
      "email":email,
      "phoneNo":phone,
      "address":address,
      "gstIn":gstIn,
      "docName":docName,
      "profilePic":this.url,
      "docPic":this.docurl,
    }
    
    this.editProfileService.saveRetailerData(retailerData);

  
    // console.log(fullName +'-'+ email+'-'+phone+'-'+address+'-'+gstIn+'-'+docName+'-'+'-'+check+'-'+this.url+' - '+this.docurl);




  }





}


