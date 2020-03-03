package hu.elte.CataflixBackEnd.entities;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected long id;

    @Version
    protected int version;
}
