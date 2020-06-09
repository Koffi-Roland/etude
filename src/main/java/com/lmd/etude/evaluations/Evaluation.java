/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.evaluations;

import com.lmd.etude.inscriptions.UniteEnseignement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Evaluation implements Serializable {
    
    
    private Long id;
    private Date date;
    private TypeEvaluation typeEvaluation;
    private UniteEnseignement uniteEnseignement;
    private List<Note> notes;

    public Evaluation() {
    }

    public Evaluation(Long id, Date date, TypeEvaluation typeEvaluation) {
        this.id = id;
        this.date = date;
        this.typeEvaluation = typeEvaluation;
    }

    public Evaluation(Date date, TypeEvaluation typeEvaluation) {
        this.date = date;
        this.typeEvaluation = typeEvaluation;
    }

    public Evaluation(Long id, Date date, TypeEvaluation typeEvaluation, UniteEnseignement uniteEnseignement) {
        this.id = id;
        this.date = date;
        this.typeEvaluation = typeEvaluation;
        this.uniteEnseignement = uniteEnseignement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TypeEvaluation getTypeEvaluation() {
        return typeEvaluation;
    }

    public void setTypeEvaluation(TypeEvaluation typeEvaluation) {
        this.typeEvaluation = typeEvaluation;
    }

    public UniteEnseignement getUniteEnseignement() {
        return uniteEnseignement;
    }

    public void setUniteEnseignement(UniteEnseignement uniteEnseignement) {
        this.uniteEnseignement = uniteEnseignement;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.date);
        hash = 29 * hash + Objects.hashCode(this.typeEvaluation);
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
        final Evaluation other = (Evaluation) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Objects.equals(this.typeEvaluation, other.typeEvaluation);
    }
    
    
}
