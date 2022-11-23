package tn.test.marwenyakoubi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.test.marwenyakoubi.entities.Clinique;
import tn.test.marwenyakoubi.repository.CliniqueRepository;

@Service
@AllArgsConstructor
public class CliniqueImpl implements Iclinique  {
    CliniqueRepository cliniqueRepository;
    @Override
    public Clinique addClinique(Clinique c) {
        return cliniqueRepository.save(c);
    }

}
