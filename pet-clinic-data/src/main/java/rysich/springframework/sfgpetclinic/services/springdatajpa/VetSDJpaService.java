package rysich.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import rysich.springframework.sfgpetclinic.model.Vet;
import rysich.springframework.sfgpetclinic.repositories.VetRepository;
import rysich.springframework.sfgpetclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
