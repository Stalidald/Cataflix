package hu.elte.CataflixBackEnd.services;

import hu.elte.CataflixBackEnd.entities.BaseEntity;
import hu.elte.CataflixBackEnd.services.exceptions.EntityInactiveException;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.Calendar;

public abstract class BaseService<Data extends BaseEntity>  {

    public abstract Iterable<Data> listAllData();

    public abstract Data loadDataById(Long id) throws EntityNotFoundException;

    public abstract Data save(Data data);

    private boolean dataValid(Data data) {return validator.validate(listAllData() ,data);}


    protected void entityInactive(BaseEntity entity) throws EntityInactiveException {
        if(entity.getStatus() == BaseEntity.ENTITY_INACTIVE) throw new EntityInactiveException();
    }

    protected void setModificationMetaData(BaseEntity entity) {
        entity.setModified(Calendar.getInstance().getTime());
        entity.setModifiedBy(getCurrentUser());
    }

    protected void setCreationMetaData(BaseEntity entity) {
        entity.setCreatedBy(getCurrentUser());
        entity.setCreated(Calendar.getInstance().getTime());
    }


    private String getCurrentUser() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    public Data addData(Data data) throws EntityExistsException {
        if(!dataValid(data)) {
            throw new EntityExistsException("SSS-1: Source data(" + data.getClass().toString() + ", " + data.getId() + ") exists)");
        }
    }



}
