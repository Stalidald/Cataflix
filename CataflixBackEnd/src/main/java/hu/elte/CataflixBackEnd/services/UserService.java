package hu.elte.CataflixBackEnd.services;

import hu.elte.CataflixBackEnd.entities.UserEntity;
import hu.elte.CataflixBackEnd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.persistence.EntityNotFoundException;

@Service
@SessionScope
public class UserService extends BaseService<UserEntity> {

    private UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<UserEntity> listAllData() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity loadDataById(Long id) throws EntityNotFoundException {
        return null;
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return null;
    }


}
