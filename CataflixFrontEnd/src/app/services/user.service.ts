import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class UserService {
  API_URL: string = '';
  constructor(private http: HttpClient) { this.API_URL = environment.serverAddress}

  getPublicContent(): Observable<any> {
    return this.http.get(this.API_URL + 'all', { responseType: 'text' });
  }

  getUserBoard(): Observable<any> {
    return this.http.get(this.API_URL + 'movies', { responseType: 'text' });
  }

  getUserByEmail(email: String) {
    return this.http.get<User>(this.API_URL + 'users/email/' + email);
  }

  updateUser(user: User) {
    return this.http.put(this.API_URL+'users/' + user.id, user);
  }

  upgradeUser(user: User) {
    return this.http.put(this.API_URL+'users/upgrade/' + user.id, user);
  }

}