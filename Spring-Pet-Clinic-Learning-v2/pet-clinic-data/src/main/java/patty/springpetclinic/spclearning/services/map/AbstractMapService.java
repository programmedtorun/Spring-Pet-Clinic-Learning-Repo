package patty.springpetclinic.spclearning.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
public abstract class AbstractMapService<T, ID> {

    // std hashmap get generics of ID and Type.
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(ID id, T obj){
        map.put(id, obj);
        return obj;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void deleteByObject(T obj){
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }


}
