package patty.springpetclinic.spclearning.services;

import patty.springpetclinic.spclearning.model.Pet;

import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
public interface PetService {
    Pet save(Pet pet);
    Pet findById(Long id);
    Set<Pet> findAll();
}
