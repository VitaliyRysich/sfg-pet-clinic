package rysich.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rysich.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
