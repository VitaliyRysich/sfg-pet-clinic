package rysich.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rysich.springframework.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
