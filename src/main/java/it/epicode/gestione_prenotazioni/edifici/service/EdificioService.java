package it.epicode.gestione_prenotazioni.edifici.service;

import it.epicode.gestione_prenotazioni.edifici.model.Edificio;
import java.util.List;
import java.util.Optional;

public interface EdificioService {
    List<Edificio> getAllEdifici();
    Optional<Edificio> getEdificioById(Long id);
    Edificio saveEdificio(Edificio edificio);
    void deleteEdificio(Long id);
}