package it.epicode.gestione_prenotazioni.prenotazioni.service;

import it.epicode.gestione_prenotazioni.prenotazioni.model.Prenotazione;
import it.epicode.gestione_prenotazioni.postazioni.model.Postazione;
import it.epicode.gestione_prenotazioni.utenti.model.Utente;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PrenotazioneService {
    List<Prenotazione> getAllPrenotazioni();
    Optional<Prenotazione> getPrenotazioneById(Long id);
    Prenotazione prenotaPostazione(Postazione postazione, Utente utente, LocalDate data) throws IllegalStateException;
    void cancellaPrenotazione(Long id);
    List<Prenotazione> getPrenotazioniByUtenteAndData(Utente utente, LocalDate data);
}