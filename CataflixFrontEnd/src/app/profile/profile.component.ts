import { Component, OnInit } from '@angular/core';

import { TokenStorageService } from '../services/token-storage.service';
import { User } from '../models/user';
import { UserService } from '../services/user.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  currentUser: User;
  editingUser: User = new User;

  constructor(private token: TokenStorageService, private userService: UserService, public _snackBar: MatSnackBar) { }

  ngOnInit() {
    if (this.token.getUser()) {
      this.userService.getUserByEmail(this.token.getUser().email).subscribe(x => {
        this.currentUser = x
        Object.assign(this.editingUser, this.currentUser);
      });
    }
  }

  editProfile() {
    if (JSON.stringify(this.currentUser) == JSON.stringify(this.editingUser)) {
      this.openSnackBar("Nem módosított adatot", "Értem")
    } else {
      Object.assign(this.currentUser, this.editingUser);
      this.userService.updateUser(this.currentUser).subscribe(x => {
        this.openSnackBar("Sikeres módosítás", "Értem")
      });
      
    }
  }

  openSnackBar(message: string, action: string) {
    this._snackBar.open(message, action, {
      duration: 2000,
    });
  }

}