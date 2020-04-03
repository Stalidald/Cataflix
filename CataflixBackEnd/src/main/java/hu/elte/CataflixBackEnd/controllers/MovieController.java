package hu.elte.CataflixBackEnd.controllers;

import hu.elte.CataflixBackEnd.entities.MovieEntity;
import hu.elte.CataflixBackEnd.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("movies")
public class MovieController {
    @Autowired
    MovieRepository movieRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<MovieEntity>> getAllMovie() {
        return ResponseEntity.ok(movieRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieEntity> getMovieById(@PathVariable long id) {
        Optional<MovieEntity> user = movieRepository.findById(id);
        if (user.isPresent()) return ResponseEntity.ok(user.get());
        else return ResponseEntity.notFound().build();
    }

    @GetMapping("/rating/{rate}")
    public ResponseEntity<Iterable<MovieEntity>> getMoviesByRating(@PathVariable int rate) {
        return ResponseEntity.ok(movieRepository.findAllByRating(rate));
    }

    @GetMapping("/ratingIsHigher/{rate}")
    public ResponseEntity<Iterable<MovieEntity>> getMoviesByRatingAfter(@PathVariable int rate) {
        return ResponseEntity.ok(movieRepository.findAllByRatingAfter(rate));
    }

    @PostMapping("")
    public ResponseEntity<?> addMovie(@RequestBody MovieEntity movieEntity) {
        MovieEntity savedMovie = movieRepository.save(movieEntity);
        return ResponseEntity.ok(savedMovie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteMovieById(@PathVariable long id) {
        Optional<MovieEntity> movieToDelete = movieRepository.findById(id);
        if (movieToDelete.isPresent()) {
            movieRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deleteByTitle/{title}")
    public ResponseEntity deleteMovieByTitle(@PathVariable String title) {
        MovieEntity movieToDelete = movieRepository.findByTitle(title).get();
        if (movieToDelete != null) {
            movieRepository.delete(movieToDelete);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.notFound().build();
    }


}
