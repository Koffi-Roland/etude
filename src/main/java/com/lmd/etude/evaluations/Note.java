/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.evaluations;

import com.lmd.etude.inscriptions.UEchoisie;
import com.lmd.etude.interfaces.ICalculMoyenne;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Note implements Serializable,ICalculMoyenne {
    
    private Long id;
    private Float noteObtenue;
    private Evaluation evalutation;
    private UEchoisie uechoisie;
    private List<Erreurs> erreurs;

    public Note() {
    }

    public Note(Long id, Float noteObtenue, Evaluation evalutation, List<Erreurs> erreurs) {
        this.id = id;
        this.noteObtenue = noteObtenue;
        this.evalutation = evalutation;
        this.erreurs = erreurs;
    }

    public Note(Long id, Float noteObtenue, Evaluation evalutation, UEchoisie uechoisie, List<Erreurs> erreurs) {
        this.id = id;
        this.noteObtenue = noteObtenue;
        this.evalutation = evalutation;
        this.uechoisie = uechoisie;
        this.erreurs = erreurs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getNoteObtenue() {
        return noteObtenue;
    }

    public void setNoteObtenue(Float noteObtenue) {
        this.noteObtenue = noteObtenue;
    }

    public Evaluation getEvalutation() {
        return evalutation;
    }

    public void setEvalutation(Evaluation evalutation) {
        this.evalutation = evalutation;
    }

    public List<Erreurs> getErreurs() {
        return erreurs;
    }

    public void setErreurs(List<Erreurs> erreurs) {
        this.erreurs = erreurs;
    }

    public UEchoisie getUechoisie() {
        return uechoisie;
    }

    public void setUechoisie(UEchoisie uechoisie) {
        this.uechoisie = uechoisie;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.noteObtenue);
        hash = 29 * hash + Objects.hashCode(this.evalutation);
        hash = 29 * hash + Objects.hashCode(this.erreurs);
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
        final Note other = (Note) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.noteObtenue, other.noteObtenue)) {
            return false;
        }
        if (!Objects.equals(this.evalutation, other.evalutation)) {
            return false;
        }
        return Objects.equals(this.erreurs, other.erreurs);
    }

    @Override
    public Float calculMoyenne(Evaluation evaluation) {
    return evaluation.getIndice().getValue()* noteObtenue;
        }
    
    
}
