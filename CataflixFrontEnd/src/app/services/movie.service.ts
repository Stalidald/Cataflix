import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Movie } from '../models/movie';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class MovieService {
  API_URL: string = '';
  constructor(private http: HttpClient) { this.API_URL = environment.serverAddress + 'movies'}

  getMovies() {
    return this.http.get<Movie[]>(this.API_URL);
  }

  getMovieById(id: Number) {
    return this.http.get<Movie>(this.API_URL + '/' + id);
  }
}