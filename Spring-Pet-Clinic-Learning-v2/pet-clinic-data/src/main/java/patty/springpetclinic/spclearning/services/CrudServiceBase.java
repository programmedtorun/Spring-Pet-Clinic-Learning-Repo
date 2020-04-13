package patty.springpetclinic.spclearning.services;

import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
// will provide multiple implmentations map, jpa, jdbc

public interface CrudServiceBase<T, ID> {
    T save(T obj);

    T findById(ID id);

    Set<T> findAll();

    void delete(T obj);

    void deleteById(ID id);

}
