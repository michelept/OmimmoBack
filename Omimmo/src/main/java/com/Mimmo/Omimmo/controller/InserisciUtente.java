package com.Mimmo.Omimmo.controller;

import com.Mimmo.Omimmo.entities.Utente;
import com.Mimmo.Omimmo.repositories.Utenterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:8080/")
@RestController
public class InserisciUtente {
    @Autowired
    private Utenterepository utenterepository;

    @PostMapping("/nuovoUtene")
    public ResponseEntity<Utente> nuovoUtente(@RequestBody Utente utenteDaAgg){
        Utente nuovoUtente= utenterepository.save(utenteDaAgg);
        return ResponseEntity.ok().body(nuovoUtente);
    }

}
