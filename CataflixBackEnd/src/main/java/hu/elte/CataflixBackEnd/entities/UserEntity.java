package hu.elte.CataflixBackEnd.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

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
}
