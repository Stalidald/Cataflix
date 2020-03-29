package hu.elte.CataflixBackEnd.repositories;

import hu.elte.CataflixBackEnd.entities.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, Long> {
    MovieEntity findByTitle(String title);

    Iterable<MovieEntity> findAllByRating(int rate);

    Iterable<MovieEntity> findAllByRatingAfter(int rate);
}
