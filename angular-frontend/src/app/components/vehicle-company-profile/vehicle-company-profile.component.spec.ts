import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicleCompanyProfileComponent } from './vehicle-company-profile.component';

describe('VehicleCompanyProfileComponent', () => {
  let component: VehicleCompanyProfileComponent;
  let fixture: ComponentFixture<VehicleCompanyProfileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VehicleCompanyProfileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VehicleCompanyProfileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
