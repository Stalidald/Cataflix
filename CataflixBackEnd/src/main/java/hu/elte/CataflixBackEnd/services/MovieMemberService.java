package hu.elte.CataflixBackEnd.services;

import hu.elte.CataflixBackEnd.entities.MovieMembersEntity;
import hu.elte.CataflixBackEnd.repositories.MovieMembersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

public class MovieMemberService extends BaseService<MovieMembersEntity> {
    MovieMembersRepository movieMembersRepository;

    @Autowired
    public MovieMemberService(MovieMembersRepository movieMembersRepository) {
        this.movieMembersRepository = movieMembersRepository;
    }

    @Override
    public Iterable<MovieMembersEntity> listAllData() {
        return movieMembersRepository.findAll();
    }

    @Override
    public MovieMembersEntity loadDataById(Long id) throws EntityNotFoundException {
        return movieMembersRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id + " not found!"));
    }

    @Override
    public MovieMembersEntity save(MovieMembersEntity movieMembersEntity) {
        return movieMembersRepository.save(movieMembersEntity);
    }
}
