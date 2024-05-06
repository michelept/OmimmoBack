package com.Mimmo.Omimmo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUtente;
    private String nome;
    private String cognome;
    private String cellulare;
    private String email;
    private String password;
    @OneToMany
    private List<Annuncio> annuncio;
}
