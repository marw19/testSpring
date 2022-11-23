package tn.test.marwenyakoubi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.test.marwenyakoubi.entities.Clinique;
import tn.test.marwenyakoubi.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin,String> {

}
