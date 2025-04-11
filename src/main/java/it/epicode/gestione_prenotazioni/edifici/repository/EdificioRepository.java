package it.epicode.gestione_prenotazioni.edifici.repository;

import it.epicode.gestione_prenotazioni.edifici.model.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}