package it.epicode.gestione_prenotazioni.prenotazioni.model;

import it.epicode.gestione_prenotazioni.utenti.model.Utente;
import it.epicode.gestione_prenotazioni.postazioni.model.Postazione;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "postazione_id", nullable = false)
    private Postazione postazione;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    @Column(nullable = false)
    private LocalDate dataPrenotazione;
}