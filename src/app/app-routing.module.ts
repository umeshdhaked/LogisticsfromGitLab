import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { DriverLoginComponent } from './components/driver-login/driver-login.component';
//import { DriverDashboardComponent } from './components/driver-dashboard/driver-dashboard.component';
import { NavigatelocationComponent } from './components/navigatelocation/navigatelocation.component';
import { SignatureComponent } from './components/signature/signature.component';
import { MaindriverdashboardComponent } from './components/maindriverdashboard/maindriverdashboard.component';

const routes: Routes = [
  { path: '', redirectTo: 'driver', pathMatch: 'full' },
  { path: 'driver', component:DriverLoginComponent},
  { path: 'driverdashboard', component:MaindriverdashboardComponent},
  { path: 'navigate', component:NavigatelocationComponent},
  { path: 'signature', component:SignatureComponent},
  
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
