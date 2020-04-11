package patty.springpetclinic.spclearning.services;

import patty.springpetclinic.spclearning.model.Vet;

import java.util.Set;

/**
 * Created by patrickskelley on Apr, 2020
 */
public interface VetService {
    Vet save(Vet vet);
    Vet findByID(Long id);
    Set<Vet> findAll();
}
