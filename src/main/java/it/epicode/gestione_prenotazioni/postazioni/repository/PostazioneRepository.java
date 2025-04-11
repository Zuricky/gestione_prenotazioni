package it.epicode.gestione_prenotazioni.postazioni.repository;

import it.epicode.gestione_prenotazioni.postazioni.model.Postazione;
import it.epicode.gestione_prenotazioni.postazioni.model.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
}