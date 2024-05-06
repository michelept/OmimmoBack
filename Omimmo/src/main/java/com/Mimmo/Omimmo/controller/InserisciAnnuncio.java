package com.Mimmo.Omimmo.controller;

import com.Mimmo.Omimmo.entities.Annuncio;
import com.Mimmo.Omimmo.entities.Immobile;
import com.Mimmo.Omimmo.entities.Utente;
import com.Mimmo.Omimmo.repositories.AnnuncioRepository;
import com.Mimmo.Omimmo.repositories.ImmobileRepository;
import com.Mimmo.Omimmo.repositories.Utenterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Optional;

@RestController
public class InserisciAnnuncio {
    @Autowired
    private AnnuncioRepository annuncioRepository;
    @Autowired
    private Utenterepository utenterepository;
    @Autowired
    private ImmobileRepository immobileRepository;
    @PostMapping("/inserisciAnnuncio")
    public ResponseEntity<?> inserisciAnnuncio(@RequestBody Annuncio nuovoAnnuncio, @RequestParam Integer idUtente) {
        Optional<Utente> utenteTrovato = utenterepository.findById(idUtente);
        if(utenteTrovato.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
            nuovoAnnuncio.setUtente(utenteTrovato.get());
        Immobile nuovoimmobile=nuovoAnnuncio.getImmobile();
        nuovoimmobile= immobileRepository.save(nuovoimmobile);
            nuovoAnnuncio.setImmobile(nuovoimmobile);
            annuncioRepository.save(nuovoAnnuncio);
        return ResponseEntity.ok().body(nuovoAnnuncio);

    }
}
