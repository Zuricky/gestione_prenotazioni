package it.epicode.gestione_prenotazioni.postazioni.service.impl;

import it.epicode.gestione_prenotazioni.postazioni.model.Postazione;
import it.epicode.gestione_prenotazioni.postazioni.model.TipoPostazione;
import it.epicode.gestione_prenotazioni.postazioni.repository.PostazioneRepository;
import it.epicode.gestione_prenotazioni.postazioni.service.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostazioneServiceImpl implements PostazioneService {

    private final PostazioneRepository postazioneRepository;

    @Autowired
    public PostazioneServiceImpl(PostazioneRepository postazioneRepository) {
        this.postazioneRepository = postazioneRepository;
    }

    @Override
    public List<Postazione> getAllPostazioni() {
        return postazioneRepository.findAll();
    }

    @Override
    public Optional<Postazione> getPostazioneById(Long id) {
        return postazioneRepository.findById(id);
    }

    @Override
    public Postazione savePostazione(Postazione postazione) {
        return postazioneRepository.save(postazione);
    }

    @Override
    public void deletePostazione(Long id) {
        postazioneRepository.deleteById(id);
    }

    @Override
    public List<Postazione> findByTipoAndCitta(TipoPostazione tipo, String citta) {
        return postazioneRepository.findByTipoAndEdificio_Citta(tipo, citta);
    }
}