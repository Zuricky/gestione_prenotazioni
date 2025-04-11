package it.epicode.gestione_prenotazioni.postazioni.service;

import it.epicode.gestione_prenotazioni.postazioni.model.Postazione;
import it.epicode.gestione_prenotazioni.postazioni.model.TipoPostazione;
import java.util.List;
import java.util.Optional;

public interface PostazioneService {
    List<Postazione> getAllPostazioni();
    Optional<Postazione> getPostazioneById(Long id);
    Postazione savePostazione(Postazione postazione);
    void deletePostazione(Long id);
    List<Postazione> findByTipoAndCitta(TipoPostazione tipo, String citta);
}