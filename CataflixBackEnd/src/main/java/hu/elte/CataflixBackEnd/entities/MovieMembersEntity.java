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
public class MovieMembersEntity extends BaseEntity{
    @Column
    private String name;

    @Column
    private String role;

    @Column
    private List<MovieEntity> relatedMovies;

}
