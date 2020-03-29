package hu.elte.CataflixBackEnd.controllers;

import hu.elte.CataflixBackEnd.entities.UserEntity;
import hu.elte.CataflixBackEnd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
