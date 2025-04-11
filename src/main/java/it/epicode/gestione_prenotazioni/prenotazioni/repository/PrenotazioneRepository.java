package it.epicode.gestione_prenotazioni.prenotazioni.repository;

import it.epicode.gestione_prenotazioni.postazioni.model.Postazione;
import it.epicode.gestione_prenotazioni.prenotazioni.model.Prenotazione;
import it.epicode.gestione_prenotazioni.utenti.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    Optional<Prenotazione> findByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
}