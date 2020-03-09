package hu.elte.CataflixBackEnd.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "user")
public class UserEntity extends BaseEntity {
    @Column
    private String name;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column
    private String type;
    @Column
    private int ageLimit;

    @Column
    private String creditCardNumber;
    @Column
    private int cvc;
    @Column
    private String expireDate;
    @Column
    private double balance;

    @Column
    @OneToMany
    private List<MovieEntity> ownedMovies;

    @Column
    @OneToMany
    private List<MovieEntity> rentedMovies;

    @Column
    @OneToMany
    private List<AchivementEntity> unlockedAchivements;

    @Column
    @OneToMany
    private List<MovieEntity> wishList;

    @Column
    @ManyToMany
    @JsonBackReference
    private List<UserEntity> relatives;


    public UserEntity(String userName, String password, String type, int version) {
        this.userName = userName;
        this.password = password;
        this.type = type;
        this.version = version;
    }

}
