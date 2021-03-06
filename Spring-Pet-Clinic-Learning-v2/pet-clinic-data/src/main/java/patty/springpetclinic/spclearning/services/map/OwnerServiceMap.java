package patty.springpetclinic.spclearning.services.map;

import org.springframework.stereotype.Service;
import patty.springpetclinic.spclearning.model.Owner;
import patty.springpetclinic.spclearning.services.OwnerService;

import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner save(Owner obj) {
        return super.save(obj);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner obj) {
        super.deleteByObject(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
