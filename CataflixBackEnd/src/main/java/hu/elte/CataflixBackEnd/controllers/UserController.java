package hu.elte.CataflixBackEnd.controllers;

import hu.elte.CataflixBackEnd.entities.UserEntity;
import hu.elte.CataflixBackEnd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<UserEntity>> getAllUser() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable long id) {
        Optional<UserEntity> user = userRepository.findById(id);
        if (user.isPresent()) return ResponseEntity.ok(user.get());
        else return ResponseEntity.notFound().build();
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserEntity> getUserByEmail(@PathVariable String email) {
        Optional<UserEntity> user = userRepository.findByEmail(email);
        if (user.isPresent()) return ResponseEntity.ok(user.get());
        else return ResponseEntity.notFound().build();
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<UserEntity> getUserByName(@PathVariable String name) {
        Optional<UserEntity> user = userRepository.findByName(name);
        if (user.isPresent()) return ResponseEntity.ok(user.get());
        else return ResponseEntity.notFound().build();
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteUserById(@PathVariable long id) {
        Optional<UserEntity> userToDelete = userRepository.findById(id);
        if (userToDelete.isPresent()) {
            userRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/deleteByTitle/{name}")
    public ResponseEntity deleteMovieByName(@PathVariable String name) {
        Optional<UserEntity> userToDelete = userRepository.findByName(name);
        if (userToDelete.isPresent()) {
            userRepository.delete(userToDelete.get());
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.notFound().build();
    }

}
