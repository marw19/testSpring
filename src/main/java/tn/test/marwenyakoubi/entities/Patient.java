package tn.test.marwenyakoubi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Patient")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPatient")
    private long idPatient;
    private String nomPatient;
    private int telephone;
    @Temporal (TemporalType.DATE)
    private Date dateNaissance;
    @OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<RendezVous> rendezVous ;
}
