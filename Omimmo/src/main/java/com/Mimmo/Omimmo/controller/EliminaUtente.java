package com.Mimmo.Omimmo.controller;

import com.Mimmo.Omimmo.entities.Utente;
import com.Mimmo.Omimmo.repositories.Utenterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EliminaUtente {
    @Autowired
    Utenterepository utenterepository;
    @DeleteMapping("/eliminaUtente")
    public ResponseEntity<Utente> utenteDaEliminare(@RequestParam Integer idUtente){
        if (utenterepository.existsById(idUtente)){
            utenterepository.deleteById(idUtente);
        }
        return ResponseEntity.ok().build();
    }
}
