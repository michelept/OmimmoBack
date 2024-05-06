package com.Mimmo.Omimmo.controller;

import com.Mimmo.Omimmo.entities.Utente;
import com.Mimmo.Omimmo.repositories.Utenterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ModificaUtente {
    @Autowired
    Utenterepository utenterepository;
    @PutMapping("/modificaUtente")
    public ResponseEntity<Utente> utenteDaModificare(@RequestParam Integer idUtente ,
                                                     @RequestBody Utente utenteDaModificare){
        Optional<Utente> utenteTrovato=utenterepository.findById(idUtente);
        if (utenteTrovato.isPresent()){
            utenterepository.save(utenteDaModificare);
            return ResponseEntity.ok().body(utenteDaModificare);
        }
        return ResponseEntity.notFound().build();
    }
}
