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
public class TypeEvaluation implements Serializable{
    private Long id;
    private String libelleTypeEvaluation;

    public TypeEvaluation() {
    }

    public TypeEvaluation(Long id, String libelleTypeEvaluation) {
        this.id = id;
        this.libelleTypeEvaluation = libelleTypeEvaluation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelleTypeEvaluation() {
        return libelleTypeEvaluation;
    }

    public void setLibelleTypeEvaluation(String libelleTypeEvaluation) {
        this.libelleTypeEvaluation = libelleTypeEvaluation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.libelleTypeEvaluation);
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
        final TypeEvaluation other = (TypeEvaluation) obj;
        if (!Objects.equals(this.libelleTypeEvaluation, other.libelleTypeEvaluation)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
}
