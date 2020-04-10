package rysich.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rysich.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
