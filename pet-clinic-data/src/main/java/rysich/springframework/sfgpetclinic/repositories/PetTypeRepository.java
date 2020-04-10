package rysich.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rysich.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
