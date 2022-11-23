package tn.test.marwenyakoubi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.test.marwenyakoubi.entities.Medecin;
import tn.test.marwenyakoubi.service.Imedecin;

public class MedcinController {
    Imedecin imedecin;
    @PostMapping("addAndAssignMedecinToClinique/{idMedecin}/{idClinique}")
    public Medecin addAndAssignMedecinToClinique(@RequestBody Medecin m, @PathVariable long idClinique) {
        return imedecin.addAndAssignMedecinToClinique(m,idClinique);
    }
}
