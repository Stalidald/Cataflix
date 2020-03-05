package hu.elte.CataflixBackEnd.entities;

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
    private List<UserEntity> relatives;


    public UserEntity(String userName, String password, String type) {
        name = "";

        this.userName = userName;
        this.password = password;
        this.type = type;

        balance = 9999999999.9;
        ownedMovies = new ArrayList<>();
        //rentedMovies = new ArrayList<>();
        //unlockedAchivements = new ArrayList<>();
        //wishList = new ArrayList<>();
        //relatives = new ArrayList<>();
        ageLimit = 0;
        creditCardNumber = "";
        cvc = 0;
        expireDate = "";
    }

}
