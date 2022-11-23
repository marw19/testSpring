package tn.test.marwenyakoubi.service;

import tn.test.marwenyakoubi.entities.Medecin;

public interface Imedecin {
    public Medecin addAndAssignMedecinToClinique(Medecin m , long idClinique);
}
