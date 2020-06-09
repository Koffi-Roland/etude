/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.evaluations;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class Erreurs {
    
    private Long id;
    private  Integer bonneNote ;
    private RapportErreur rapportErreur;

    public Erreurs() {
    }

    public Erreurs(Long id, Integer bonneNote) {
        this.id = id;
        this.bonneNote = bonneNote;
    }

    public Erreurs(Long id, Integer bonneNote, RapportErreur rapportErreur) {
        this.id = id;
        this.bonneNote = bonneNote;
        this.rapportErreur = rapportErreur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBonneNote() {
        return bonneNote;
    }

    public void setBonneNote(Integer bonneNote) {
        this.bonneNote = bonneNote;
    }

    public RapportErreur getRapportErreur() {
        return rapportErreur;
    }

    public void setRapportErreur(RapportErreur rapportErreur) {
        this.rapportErreur = rapportErreur;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.bonneNote);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Erreurs other = (Erreurs) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.bonneNote, other.bonneNote);
    }

   
    
}
