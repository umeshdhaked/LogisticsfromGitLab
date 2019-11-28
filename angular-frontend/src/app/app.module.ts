import { GetlistService } from './services/getlist.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { SignupComponent } from './signup/signup.component';
import { VerifyComponent } from './verify/verify.component';
import { EditProfileComponent } from './edit-profile/edit-profile.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatFormFieldModule} from '@angular/material/form-field';
import {A11yModule} from '@angular/cdk/a11y';
import {DragDropModule} from '@angular/cdk/drag-drop';
import {PortalModule} from '@angular/cdk/portal';
import {ScrollingModule} from '@angular/cdk/scrolling';
import {CdkStepperModule} from '@angular/cdk/stepper';
import {CdkTableModule} from '@angular/cdk/table';
import {CdkTreeModule} from '@angular/cdk/tree';
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import {MatBadgeModule} from '@angular/material/badge';
import {MatBottomSheetModule} from '@angular/material/bottom-sheet';
import {MatButtonModule} from '@angular/material/button';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatCardModule} from '@angular/material/card';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatChipsModule} from '@angular/material/chips';
import {MatStepperModule} from '@angular/material/stepper';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatDialogModule} from '@angular/material/dialog';
import {MatDividerModule} from '@angular/material/divider';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatIconModule} from '@angular/material/icon';
import {MatInputModule} from '@angular/material/input';
import {MatListModule} from '@angular/material/list';
import {MatMenuModule} from '@angular/material/menu';
import {MatNativeDateModule, MatRippleModule} from '@angular/material/core';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import {MatRadioModule} from '@angular/material/radio';
import {MatSelectModule} from '@angular/material/select';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatSliderModule} from '@angular/material/slider';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatSortModule} from '@angular/material/sort';
import {MatTableModule} from '@angular/material/table';
import {MatTabsModule} from '@angular/material/tabs';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatTreeModule} from '@angular/material/tree';
import { AddOrderComponent } from './add-order/add-order.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { DriverDashboardComponent } from './driver-dashboard/driver-dashboard.component';
import { RemainingVolumePipe } from './remaining-volume.pipe';
import { RetailerDashboardComponent } from './retailer-dashboard/retailer-dashboard.component';
import { ChartsModule } from 'ng2-charts';
// import { RatecardpopupComponent } from './ratecardpopup/ratecardpopup.component';
import { VehicledemandfrontendComponent } from './vehicledemandfrontend/vehicledemandfrontend.component';
import { FormsModule } from '@angular/forms';
import { VehicleManagementComponent } from './vehicle-management/vehicle-management.component';
import { RequestsComponent } from './vehicle-management/requests/requests.component';
import { ViewVehicleComponent } from './vehicledemandfrontend/view-vehicle/view-vehicle.component';



import { NgAlertModule } from '@theo4u/ng-alert';





import { ReactiveFormsModule } from '@angular/forms';
import { ManageVehiclesComponent } from './vehicle-management/manage-vehicles/manage-vehicles.component';






  


import { ViewProfileComponent } from './view-profile/view-profile.component';
import { TimeSlotPipe } from './time-slot.pipe';
import { VerifyUserComponent } from './verify-user/verify-user.component';
import { VehicleHistoryComponent } from './vehicle-management/vehicle-history/vehicle-history.component';
import { from } from 'rxjs';
import { BookedVehiclesComponent } from './vehicledemandfrontend/booked-vehicles/booked-vehicles.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    SignupComponent,
    VerifyComponent,
    AddOrderComponent,
    EditProfileComponent,
    PageNotFoundComponent,
    DriverDashboardComponent,
    RemainingVolumePipe,
    RetailerDashboardComponent,
    VehicledemandfrontendComponent,
    // RatecardpopupComponent,
    VehicleManagementComponent,
    ViewVehicleComponent,
    BookedVehiclesComponent,
  
    RequestsComponent,
  
    ManageVehiclesComponent,
    ViewProfileComponent,
    TimeSlotPipe,
    VerifyUserComponent,
    VehicleHistoryComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule,

    BrowserModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatAutocompleteModule,
    MatCheckboxModule,
    HttpClientModule,
    ReactiveFormsModule,


    A11yModule,
    CdkStepperModule,
    CdkTableModule,
    CdkTreeModule,
    DragDropModule,
    MatAutocompleteModule,
    MatBadgeModule,
    MatBottomSheetModule,
    MatButtonModule,
    MatButtonToggleModule,
    MatCardModule,
    MatCheckboxModule,
    MatChipsModule,
    MatStepperModule,
    MatDatepickerModule,
    MatDialogModule,
    MatDividerModule,
    MatExpansionModule,
    MatGridListModule,
    MatIconModule,
    MatInputModule,
    MatListModule,
    MatMenuModule,
    MatNativeDateModule,
    MatPaginatorModule,
    MatProgressBarModule,
    MatProgressSpinnerModule,
    MatRadioModule,
    MatRippleModule,
    MatSelectModule,
    MatSidenavModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatSnackBarModule,
    MatSortModule,
    MatTableModule,
    MatTabsModule,
    MatToolbarModule,
    MatTooltipModule,
    MatTreeModule,
    PortalModule,
    ScrollingModule,

    ChartsModule,
    NgAlertModule

  ],
  entryComponents: [ViewVehicleComponent,BookedVehiclesComponent],
  providers: [GetlistService],
  bootstrap: [AppComponent]
})
export class AppModule { }
