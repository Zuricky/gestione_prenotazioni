package it.epicode.gestione_prenotazioni.edifici.service.impl;

import it.epicode.gestione_prenotazioni.edifici.model.Edificio;
import it.epicode.gestione_prenotazioni.edifici.repository.EdificioRepository;
import it.epicode.gestione_prenotazioni.edifici.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdificioServiceImpl implements EdificioService {

    private final EdificioRepository edificioRepository;

    @Autowired
    public EdificioServiceImpl(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    @Override
    public List<Edificio> getAllEdifici() {
        return edificioRepository.findAll();
    }

    @Override
    public Optional<Edificio> getEdificioById(Long id) {
        return edificioRepository.findById(id);
    }

    @Override
    public Edificio saveEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public void deleteEdificio(Long id) {
        edificioRepository.deleteById(id);
    }
}