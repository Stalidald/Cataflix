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
public class MovieEntity extends BaseEntity{
    @Column
    private String title;

    @Column
    private List<MovieMembersEntity> relatedMovieMembers;

    @Column
    private int ageLimit;

    @Column
    private int releaseYear;

    @Column
    private String description;

    @Column
    private int rating;
}
