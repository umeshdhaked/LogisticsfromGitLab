import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-canceldialogue',
  templateUrl: './canceldialogue.component.html',
  styleUrls: ['./canceldialogue.component.scss'],
})
export class CanceldialogueComponent implements OnInit {

  constructor(private router: Router, public dialog: MatDialog) { }

  ngOnInit() {}

  onyes() {
    this.dialog.closeAll();
    this.router.navigateByUrl('reasons').then(r => null);
  }


}
