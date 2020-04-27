package patty.springpetclinic.spclearning.services.map;

import patty.springpetclinic.spclearning.model.Pet;
import patty.springpetclinic.spclearning.services.PetService;

import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
// PetService interface extends CrudServiceBase and allows for crud methods. 

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

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
