package com.Mimmo.Omimmo.controller;

import com.Mimmo.Omimmo.entities.Immobile;
import com.Mimmo.Omimmo.entities.Utente;
import com.Mimmo.Omimmo.repositories.AnnuncioRepository;
import com.Mimmo.Omimmo.repositories.Utenterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class InserisciImmobile {
    @Autowired
    Utenterepository utenterepository;
    @Autowired
    AnnuncioRepository annuncioRepository;
//    @PostMapping("/inserisciImmobile")
//    public ResponseEntity<Immobile> inserisciImmobile(@RequestBody Immobile nuovoImmobile,Integer idUtente){
//        Optional<Utente> utenteTrovato=utenterepository.findById(idUtente);
//        if (utenteTrovato.isEmpty()){
//            return ResponseEntity.badRequest().build();
//        }
//        utenteTrovato.get().setAnnuncio(nuovoImmobile.setAnnuncio(nuovoImmobile));

//        nuovoAnnuncio.setUtente(utenteTrovato.get());
//        annuncioRepository.save(nuovoAnnuncio);
    }
//}
