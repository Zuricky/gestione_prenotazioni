package it.epicode.gestione_prenotazioni.prenotazioni.service.impl;

import it.epicode.gestione_prenotazioni.prenotazioni.model.Prenotazione;
import it.epicode.gestione_prenotazioni.postazioni.model.Postazione;
import it.epicode.gestione_prenotazioni.utenti.model.Utente;
import it.epicode.gestione_prenotazioni.prenotazioni.repository.PrenotazioneRepository;
import it.epicode.gestione_prenotazioni.prenotazioni.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {

    private final PrenotazioneRepository prenotazioneRepository;

    @Autowired
    public PrenotazioneServiceImpl(PrenotazioneRepository prenotazioneRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
    }

    @Override
    public List<Prenotazione> getAllPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    @Override
    public Optional<Prenotazione> getPrenotazioneById(Long id) {
        return prenotazioneRepository.findById(id);
    }

    @Override
    @Transactional
    public Prenotazione prenotaPostazione(Postazione postazione, Utente utente, LocalDate data) throws IllegalStateException {
        // Verifica se la postazione è già prenotata per quella data
        if (prenotazioneRepository.findByPostazioneAndDataPrenotazione(postazione, data).isPresent()) {
            throw new IllegalStateException("La postazione " + postazione.getCodiceUnico() + " è già prenotata per la data " + data);
        }

        // Verifica se l'utente ha già una prenotazione per quella data
        if (!prenotazioneRepository.findByUtenteAndDataPrenotazione(utente, data).isEmpty()) {
            throw new IllegalStateException("L'utente " + utente.getUsername() + " ha già una prenotazione per la data " + data);
        }

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setPostazione(postazione);
        prenotazione.setUtente(utente);
        prenotazione.setDataPrenotazione(data);
        return prenotazioneRepository.save(prenotazione);
    }

    @Override
    public void cancellaPrenotazione(Long id) {
        prenotazioneRepository.deleteById(id);
    }

    @Override
    public List<Prenotazione> getPrenotazioniByUtenteAndData(Utente utente, LocalDate data) {
        return prenotazioneRepository.findByUtenteAndDataPrenotazione(utente, data);
    }
}