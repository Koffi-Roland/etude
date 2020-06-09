/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.evaluations;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Indice implements Serializable {
    
    
    private Long id;
    private String libelle;
    private Float value;
    private Evaluation evaluation;

    public Indice() {
    }

    public Indice(Long id, String libelle, Float value) {
        this.id = id;
        this.libelle = libelle;
        this.value = value;
    }

    public Indice(Long id, String libelle, Float value, Evaluation evaluation) {
        this.id = id;
        this.libelle = libelle;
        this.value = value;
        this.evaluation = evaluation;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.libelle);
        hash = 19 * hash + Objects.hashCode(this.value);
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
        final Indice other = (Indice) obj;
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.value, other.value);
    }
      
    
    
}
