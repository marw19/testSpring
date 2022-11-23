package tn.test.marwenyakoubi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="RendezVous")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RendezVous implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRDV")
    private long idRDV;
    @Temporal (TemporalType.DATE)
    private Date dateRDV;
    private String remarque;

    @ManyToOne
    @JsonIgnore
    private Medecin medecin ;
    @ManyToOne
    @JsonIgnore
    private Patient patient ;
}
