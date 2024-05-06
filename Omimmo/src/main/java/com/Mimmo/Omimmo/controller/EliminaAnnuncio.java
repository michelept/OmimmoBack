package com.Mimmo.Omimmo.controller;

import com.Mimmo.Omimmo.entities.Annuncio;
import com.Mimmo.Omimmo.repositories.AnnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EliminaAnnuncio {
    @Autowired
    AnnuncioRepository annuncioRepository;
    @DeleteMapping("/eliminaAnnuncio")
    public ResponseEntity<Annuncio> eliminaAnnuncio(@RequestParam Integer idAnnuncio){
        Optional<Annuncio> annuncioTrovato= annuncioRepository.findById(idAnnuncio);
        if (annuncioTrovato.isPresent()){
            annuncioRepository.deleteById(idAnnuncio);
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
