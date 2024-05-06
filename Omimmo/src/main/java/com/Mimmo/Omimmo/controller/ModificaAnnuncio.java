package com.Mimmo.Omimmo.controller;

import com.Mimmo.Omimmo.entities.Annuncio;
import com.Mimmo.Omimmo.repositories.AnnuncioRepository;
import com.Mimmo.Omimmo.repositories.ImmobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ModificaAnnuncio {
    @Autowired
    AnnuncioRepository annuncioRepository;
    @Autowired
    ImmobileRepository immobileRepository;
    @PutMapping("/modificaAnnuncio")
    public ResponseEntity<Annuncio> modificaAnnuncio(@RequestParam Integer idUtente,
                                                     @RequestBody Annuncio annuncioDaForm){
       Optional<Annuncio> annuncioDaModificare=annuncioRepository.findById(idUtente);
       if (annuncioDaModificare.isPresent()){
           immobileRepository.save(annuncioDaForm.getImmobile());
           annuncioRepository.save(annuncioDaForm);
           return ResponseEntity.ok().build();
       }
       return ResponseEntity.notFound().build();
    }
}
