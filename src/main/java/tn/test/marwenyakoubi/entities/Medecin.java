package tn.test.marwenyakoubi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Medecin")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMedecin")
    private long idMedcin;
    private String nomMedecin;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private int telephone;
    private int prixConsultation;

    @OneToMany(mappedBy = "medecin",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<RendezVous> rendezVous;
    @ManyToMany(mappedBy ="medecins",cascade = CascadeType.ALL)
    private Set<Clinique> cliniques;
}
