package patty.springpetclinic.spclearning.services.map;

import patty.springpetclinic.spclearning.model.BaseEntity;

import java.util.*;

/**
 * Created by patrickskelley on Apr, 2020
 */

// T extends base entity allows us to make assumptions like has id value that must extend long
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    // std hashmap get generics of ID and Type.
    // changed key to be Long
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T obj){

        // if obj not null try to get id, if that's null then grab next id
        if(obj != null){
            if(obj.getId() == null){
                obj.setId(getNextId());
            }
            // save obj in map with next id val
            map.put(obj.getId(), obj);
        } else {
            throw new RuntimeException("obj can not be null");
        }
        return obj;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void deleteByObject(T obj){
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }

    private Long getNextId(){
        Long nextId = null;
        // if map is empty and has not been init then give it first id val of 1. 
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }


}
