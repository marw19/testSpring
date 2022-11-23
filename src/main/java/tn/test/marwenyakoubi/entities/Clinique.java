package tn.test.marwenyakoubi.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Clinique")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Clinique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idClinique")
    private long idClinique;
    private String nomClinique;
    private String adresse;
    private int telephone;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Medecin> medecins;

    public void setMedecin(Medecin m) {
    }
}
