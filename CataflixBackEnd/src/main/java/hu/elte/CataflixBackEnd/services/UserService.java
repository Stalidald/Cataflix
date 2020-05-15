package hu.elte.CataflixBackEnd.services;

import hu.elte.CataflixBackEnd.entities.UserEntity;
import hu.elte.CataflixBackEnd.repositories.UserRepository;
import hu.elte.CataflixBackEnd.services.exceptions.EmailNotFoundException;
import hu.elte.CataflixBackEnd.services.exceptions.NameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;


@Service
@SessionScope
public class UserService extends BaseService<UserEntity> {

    private UserRepository userRepository;

    /**
     * Constructor of UserService instance
     */
    public UserService() {

    }

    /**
     * Constructor of UserService instance based on user repository
     * @param userRepository
     */
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * @return all data from user repository
     */
    @Override
    public Iterable<UserEntity> listAllData() {
        return userRepository.findAll();
    }

    /**
     * Loads data by ID
     * @param id
     * @return loaded data
     * @throws EntityNotFoundException if data by ID does not exist
     */
    @Override
    public UserEntity loadDataById(Long id) throws EntityNotFoundException {
        return userRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id + " not found!"));
    }

    /**
     * Updates user
     * @param newUser user to update
     * @param id the if of the user
     * @return updated user, or null, if user does not exist
     */
    public UserEntity updateUser(UserEntity newUser, Long id) {
        Optional<UserEntity> oldUser = userRepository.findById(id);
        if(oldUser.isPresent()){
            newUser.setId(id);
            UserEntity newSavedUser = userRepository.save(newUser);
            return newSavedUser;
        }else{
            return null;
        }
    }

    /**
     * Saves user entity to repository
     * @param userEntity to save
     * @return
     */
    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    /**
     * Loads user by email
     * @param email
     * @return
     * @throws EmailNotFoundException
     */
    public UserEntity loadUserByEmail(String email) throws EmailNotFoundException {
        return userRepository
                .findByEmail(email)
                .orElseThrow(() -> new EmailNotFoundException(email + " not found!"));
    }

    /**
     * Loads user by name
     * @param name
     * @return
     * @throws NameNotFoundException
     */
    public UserEntity loadUserByName(String name) throws NameNotFoundException {
        return userRepository
                .findByName(name)
                .orElseThrow(() -> new NameNotFoundException(name + " not found!"));
    }
}
