package hu.elte.CataflixBackEnd.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import hu.elte.CataflixBackEnd.models.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(	name = "user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "userName"),
                @UniqueConstraint(columnNames = "email")
        })
public class UserEntity extends BaseEntity {
    @Column
    private String name;

    @Email
    @Column(nullable = false)
    private String email;

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

    @Column
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();


    public UserEntity(String userName, String password,String email, String type, int version) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.type = type;
        this.version = version;
    }

    public UserEntity(String username, String email, String password) {
        this.userName = username;
        this.email = email;
        this.password = password;
    }


    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
