package com.Mimmo.Omimmo.controller;

import com.Mimmo.Omimmo.entities.Utente;
import com.Mimmo.Omimmo.repositories.Utenterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@CrossOrigin("http://localhost:8080/")
@RestController
public class LoginUtente {
    @Autowired
    private Utenterepository utenterepository;

    @GetMapping("/login")
    public ResponseEntity<Optional<Utente>> login(@RequestParam String email, String password){
        Optional<Utente> trovato=utenterepository.findByEmailAndPassword(email, password);
        if (trovato.isPresent()){
            return ResponseEntity.ok().body(trovato);
        }
        return ResponseEntity.ofNullable(trovato);
    }
}
