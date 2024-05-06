package com.Mimmo.Omimmo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Immobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idImmobile;
    private int superfice;
    private  int piano;
    private boolean giardino;
    private int balconi;
    private String citta;
    private String via;
    private double latitudine;
    private double longitudine;
    private String civico;
    private double prezzo;
    private String descrizione;
    @Column(length = 999999999)
    private byte[] foto;
    @OneToOne
    private Annuncio annuncio;
}
