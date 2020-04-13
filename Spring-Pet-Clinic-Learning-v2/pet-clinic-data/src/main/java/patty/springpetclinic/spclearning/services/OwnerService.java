package patty.springpetclinic.spclearning.services;

import patty.springpetclinic.spclearning.model.Owner;

/**
 * Created by patrickskelley on Apr, 2020
 */
// ultimately we will have multiple impl of services. a map model but ALSO spring data JPA

public interface OwnerService extends CrudServiceBase<Owner, Long> {
    Owner findByLastName(String lastName);
}
