package hu.elte.CataflixBackEnd.repositories;

import hu.elte.CataflixBackEnd.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findByUserName(String userName);
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findByName(String name);


    Boolean existsByUserName(String userName);

    Boolean existsByEmail(String email);
}
