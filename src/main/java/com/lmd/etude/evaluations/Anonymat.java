/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.evaluations;

import com.lmd.etude.inscriptions.UEchoisie;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Anonymat implements Serializable{
    
    private Long id;
    private String numero;
    private UEchoisie uechoisie; 
    private Evaluation evaluation;

    public Anonymat() {
    }

    public Anonymat(Long id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public UEchoisie getUechoisie() {
        return uechoisie;
    }

    public void setUechoisie(UEchoisie uechoisie) {
        this.uechoisie = uechoisie;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.numero);
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
        final Anonymat other = (Anonymat) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
}
