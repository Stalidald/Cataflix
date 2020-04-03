package hu.elte.CataflixBackEnd.controllers;

import hu.elte.CataflixBackEnd.entities.AchivementEntity;
import hu.elte.CataflixBackEnd.services.AchivementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/achivement")
public class AchivementController extends BaseController {

    @Autowired
    AchivementService achivementService;

    @GetMapping("")
    public ResponseEntity<Iterable<AchivementEntity>> listAllUser() {
        return ResponseEntity.ok(achivementService.listAllData());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AchivementEntity> getUserById(@PathVariable long id) {
        return ResponseEntity.ok(achivementService.loadDataById(id));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<AchivementEntity> getUserByName(@PathVariable String name) {
        try {
            return ResponseEntity.ok(achivementService.findByName(name));
        } catch (EntityNotFoundException e) {
            return createBadRequest(e);
        }
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteUserById(@PathVariable long id) {
        return ResponseEntity
                .ok(achivementService.deleteData(achivementService.loadDataById(id)));
    }

    @DeleteMapping("/deleteByName/{name}")
    public ResponseEntity deleteMovieByName(@PathVariable String name) {
        return ResponseEntity.ok(achivementService.deleteData(achivementService.findByName(name)));
    }
}
