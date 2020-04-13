package patty.springpetclinic.spclearning.services.map;

import patty.springpetclinic.spclearning.model.Pet;
import patty.springpetclinic.spclearning.services.CrudServiceBase;

import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
// must implement methods in CrudServiceBase and inherriting from Abstract class

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudServiceBase<Pet, Long> {

    @Override
    public Pet save(Pet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return findAll();
    }

    @Override
    public void delete(Pet obj) {
        super.deleteByObject(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
