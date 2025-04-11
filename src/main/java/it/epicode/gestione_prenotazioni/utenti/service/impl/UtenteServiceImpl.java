package it.epicode.gestione_prenotazioni.utenti.service.impl;

import it.epicode.gestione_prenotazioni.utenti.model.Utente;
import it.epicode.gestione_prenotazioni.utenti.repository.UtenteRepository;
import it.epicode.gestione_prenotazioni.utenti.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtenteServiceImpl implements UtenteService {

    private final UtenteRepository utenteRepository;

    @Autowired
    public UtenteServiceImpl(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }

    @Override
    public List<Utente> getAllUtenti() {
        return utenteRepository.findAll();
    }

    @Override
    public Optional<Utente> getUtenteById(Long id) {
        return utenteRepository.findById(id);
    }

    @Override
    public Optional<Utente> getUtenteByUsername(String username) {
        return utenteRepository.findByUsername(username);
    }

    @Override
    public Utente saveUtente(Utente utente) {
        return utenteRepository.save(utente);
    }

    @Override
    public void deleteUtente(Long id) {
        utenteRepository.deleteById(id);
    }
}