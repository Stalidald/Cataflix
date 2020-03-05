package hu.elte.CataflixBackEnd.repositories;

import hu.elte.CataflixBackEnd.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<UserEntity, Long> {

}
