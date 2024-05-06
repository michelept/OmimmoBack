package com.Mimmo.Omimmo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Annuncio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAnnuncio;
    private Tipo tipo;
    @OneToOne
    private Immobile immobile;
    @ManyToOne
    private Utente utente;

}
