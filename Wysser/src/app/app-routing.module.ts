import { VerifyComponent } from './verify/verify.component';
import { HomeComponent } from './home/home.component';
import { SignupComponent } from './signup/signup.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EditProfileComponent } from './edit-profile/edit-profile.component';


const routes: Routes = [
{ path : '', component: HomeComponent},
{path: 'signup', component: SignupComponent},
{path: 'verify', component: VerifyComponent},
{path: 'editProfile', component: EditProfileComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
  export const routingModule = [HomeComponent, SignupComponent, VerifyComponent, EditProfileComponent]

