package patty.springpetclinic.spclearning.services.map;

import org.springframework.stereotype.Service;
import patty.springpetclinic.spclearning.model.Vet;
import patty.springpetclinic.spclearning.services.VetService;

import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Service // I want map impl of crud service interfaces brought into spring ctx as spring beans
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet obj) {
        super.deleteByObject(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
