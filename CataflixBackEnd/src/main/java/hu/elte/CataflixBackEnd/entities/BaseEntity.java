package hu.elte.CataflixBackEnd.entities;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Version
    protected int version;

    public long getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }
}
