package it.epicode.gestione_prenotazioni.utenti.repository;

import it.epicode.gestione_prenotazioni.utenti.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
    Optional<Utente> findByUsername(String username);
}