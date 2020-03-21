package rysich.springframework.sfgpetclinic.services.map;

import rysich.springframework.sfgpetclinic.model.PetType;
import rysich.springframework.sfgpetclinic.services.PetTypeService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType t) {
        super.delete(t);
    }

    @Override
    public PetType save(PetType t) {
        return super.save(t);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}