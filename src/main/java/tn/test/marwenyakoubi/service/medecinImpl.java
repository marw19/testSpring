package tn.test.marwenyakoubi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.test.marwenyakoubi.entities.Clinique;
import tn.test.marwenyakoubi.entities.Medecin;
import tn.test.marwenyakoubi.repository.CliniqueRepository;
import tn.test.marwenyakoubi.repository.MedecinRepository;
@Service
@AllArgsConstructor
public class medecinImpl implements Imedecin{

    @Override
    public Medecin addAndAssignMedecinToClinique(Medecin m, long idClinique) {
        Clinique clinique= CliniqueRepository.findById(idClinique).orElse(null);
        MedecinRepository.save(m);
        clinique.setMedecin(m);
        CliniqueRepository.save(clinique);
        return m;

    }
}
