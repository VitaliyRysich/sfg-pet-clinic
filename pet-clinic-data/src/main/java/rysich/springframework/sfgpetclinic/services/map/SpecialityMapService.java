package rysich.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import rysich.springframework.sfgpetclinic.model.Speciality;
import rysich.springframework.sfgpetclinic.services.SpecialtyService;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }
}
