package rysich.springframework.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import rysich.springframework.sfgpetclinic.model.Visit;
import rysich.springframework.sfgpetclinic.services.VisitService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {



    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public Visit save(Visit visit) {

        if (visit != null){
            if (visit.getPet() != null && visit.getPet().getOwner() != null && visit.getPet().getId() != null){
                return super.save(visit);
            } else {
                throw new RuntimeException("Invalid Pet");
            }
        } else
            return null;
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
