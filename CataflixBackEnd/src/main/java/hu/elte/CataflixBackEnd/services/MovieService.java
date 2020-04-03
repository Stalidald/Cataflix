package hu.elte.CataflixBackEnd.services;

import hu.elte.CataflixBackEnd.entities.MovieEntity;
import hu.elte.CataflixBackEnd.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

public class MovieService extends BaseService<MovieEntity> {
    MovieRepository movieRepository;

    public MovieService() { }

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Iterable<MovieEntity> listAllData() {
        return movieRepository.findAll();
    }

    @Override
    public MovieEntity loadDataById(Long id) throws EntityNotFoundException {
        return movieRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id + " not found!"));
    }

    @Override
    public MovieEntity save(MovieEntity movieEntity) {
        return movieRepository.save(movieEntity);
    }

    public MovieEntity findByTitle(String title) {
        return movieRepository
                .findByTitle(title)
                .orElseThrow(() -> new EntityNotFoundException(title + " not found!"));
    }

    public Iterable<MovieEntity> findAboveRating(int rating) {
        return movieRepository.findAllByRatingAfter(rating);
    }


}
