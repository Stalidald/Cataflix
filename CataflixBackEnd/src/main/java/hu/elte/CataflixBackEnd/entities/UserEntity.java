package hu.elte.CataflixBackEnd.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private String userName;
    @Column
    private String password;

    @Column
    private double balance;
    @Column
    private List<MovieEntity> ownedMovies;
    @Column
    private List<MovieEntity> rentedMovies;
    @Column
    private List<AchivementEntity> unlockedAchivements;
    @Column
    private List<MovieEntity> wishList;

    @Column
    private String type;
    @Column
    private List<Long> relatives;
    @Column
    private int ageLimit;
    @Column
    private String creditCardNumber;
    @Column
    private int cvc;
    @Column
    private String expireDate;

}
