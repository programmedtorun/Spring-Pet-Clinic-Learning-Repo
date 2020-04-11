package patty.springpetclinic.spclearning.services;

import patty.springpetclinic.spclearning.model.Owner;

import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
public interface OwnerService {
    Owner findByID(Long id);
    Owner save(Owner owner);
    Owner findByLastName(String lastName);
    Set<Owner> findAll();
}
