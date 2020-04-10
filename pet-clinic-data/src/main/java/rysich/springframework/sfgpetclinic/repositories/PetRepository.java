package rysich.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rysich.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
