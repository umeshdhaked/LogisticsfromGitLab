import { VerifyComponent } from './components/verify/verify.component';
import { HomeComponent } from './components/home/home.component';
import { SignupComponent } from './components/signup/signup.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EditProfileComponent } from './components/edit-profile/edit-profile.component';
import { AddOrderComponent } from './components/add-order/add-order.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { DriverDashboardComponent } from './components/driver-dashboard/driver-dashboard.component';
import { RetailerDashboardComponent } from './components/retailer-dashboard/retailer-dashboard.component';
import { VehicledemandfrontendComponent } from './components/vehicledemandfrontend/vehicledemandfrontend.component';
import { VehicleManagementComponent } from './components/vehicle-management/vehicle-management.component';
import { RequestsComponent } from './components/vehicle-management/requests/requests.component';


import { ManageVehiclesComponent } from './components/vehicle-management/manage-vehicles/manage-vehicles.component';


import { ViewProfileComponent } from './components/view-profile/view-profile.component';
import { VerifyUserComponent } from './components/verify-user/verify-user.component';
import { LoginPageComponent } from './components/login-page/login-page.component';


const routes: Routes = [
{path: '', redirectTo: '/home', pathMatch: 'full'},
{path: 'home', component: HomeComponent},
{path: 'signup', component: SignupComponent},
{path: 'verify', component: VerifyComponent},
{path: 'editProfile', component: EditProfileComponent},
{path: 'addOrder', component: AddOrderComponent},
{path: 'driver', component: DriverDashboardComponent},
{path: 'retailer', component: RetailerDashboardComponent},
{path: 'vehicle-management',component:VehicleManagementComponent,children:[
  {path: 'requests',component: RequestsComponent}
]},
{path: 'manage-vehicle',component:ManageVehiclesComponent},
{path: 'retailerVehicleDemand', component: VehicledemandfrontendComponent},
{path:'viewProfile',component:ViewProfileComponent},
{path: 'confirm/:token', component: VerifyUserComponent},
{path: 'login', component: LoginPageComponent},
{path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule {}
  export const routingModule = [HomeComponent, SignupComponent, VerifyComponent, EditProfileComponent, PageNotFoundComponent,VehicleManagementComponent,RequestsComponent,ManageVehiclesComponent, ViewProfileComponent]

