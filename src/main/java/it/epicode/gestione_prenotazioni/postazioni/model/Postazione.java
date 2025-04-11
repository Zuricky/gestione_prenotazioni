package it.epicode.gestione_prenotazioni.postazioni.model;

import it.epicode.gestione_prenotazioni.edifici.model.Edificio;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "postazioni")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codiceUnico;

    private String descrizione;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;

    @Column(nullable = false)
    private Integer numeroMassimoOccupanti;

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;
}