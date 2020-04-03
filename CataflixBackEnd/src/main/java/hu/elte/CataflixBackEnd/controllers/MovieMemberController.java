package hu.elte.CataflixBackEnd.controllers;

import hu.elte.CataflixBackEnd.entities.MovieMembersEntity;
import hu.elte.CataflixBackEnd.services.MovieMemberService;
import hu.elte.CataflixBackEnd.services.exceptions.NameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/moviemember")
public class MovieMemberController extends BaseController {

    @Autowired
    MovieMemberService movieMemberService;

    @GetMapping("")
    public ResponseEntity<Iterable<MovieMembersEntity>> listAllUser() {
        return ResponseEntity.ok(movieMemberService.listAllData());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieMembersEntity> getUserById(@PathVariable long id) {
        return ResponseEntity.ok(movieMemberService.loadDataById(id));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<MovieMembersEntity> getUserByName(@PathVariable String name) {
        try {
            return ResponseEntity.ok(movieMemberService.loadUserByName(name));
        } catch (NameNotFoundException e) {
            return createBadRequest(e);
        }
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteUserById(@PathVariable long id) {
        return ResponseEntity
                .ok(movieMemberService.deleteData(movieMemberService.loadDataById(id)));
    }

    @DeleteMapping("/deleteByName/{name}")
    public ResponseEntity deleteMovieByName(@PathVariable String name) {
        try {
            return ResponseEntity.ok(movieMemberService.deleteData(movieMemberService.loadUserByName(name)));
        } catch (NameNotFoundException ex) {
            return createBadRequest(ex);
        }
    }
}
