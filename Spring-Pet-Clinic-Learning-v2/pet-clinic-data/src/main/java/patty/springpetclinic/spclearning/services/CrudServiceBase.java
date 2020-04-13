package patty.springpetclinic.spclearning.services;

import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
public interface CrudServiceBase<T, ID> {
    T save(T obj);
    T findByID(ID id);
    Set<T> findAll();
    void delete(T obj);
    void deleteByID(ID id);
}
