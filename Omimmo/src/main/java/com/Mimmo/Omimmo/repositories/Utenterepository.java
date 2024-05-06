package com.Mimmo.Omimmo.repositories;

import com.Mimmo.Omimmo.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Utenterepository extends JpaRepository<Utente,Integer> {
    Optional<Utente>findByEmailAndPassword(String email, String password);
}
