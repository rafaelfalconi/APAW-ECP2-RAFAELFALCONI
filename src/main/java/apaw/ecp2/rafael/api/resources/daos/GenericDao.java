package apaw.ecp2.rafael.api.resources.daos;

import java.util.List;

public interface GenericDao<T, ID> {
    
    void create (T entity);
    
    T read (ID id);
    
    List<T> findAll();

}
