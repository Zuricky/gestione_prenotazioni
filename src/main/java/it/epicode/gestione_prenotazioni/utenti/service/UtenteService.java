package it.epicode.gestione_prenotazioni.utenti.service;

import it.epicode.gestione_prenotazioni.utenti.model.Utente;
import java.util.List;
import java.util.Optional;

public interface UtenteService {
    List<Utente> getAllUtenti();
    Optional<Utente> getUtenteById(Long id);
    Optional<Utente> getUtenteByUsername(String username);
    Utente saveUtente(Utente utente);
    void deleteUtente(Long id);
}