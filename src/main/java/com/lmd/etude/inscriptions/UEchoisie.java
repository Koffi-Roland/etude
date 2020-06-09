/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.inscriptions;

import com.lmd.etude.deliberation.Decision;
import com.lmd.etude.evaluations.Note;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class UEchoisie implements Serializable {
     private boolean validee;
     private List<UniteEnseignement> uniteEnseignements;
     private List<Inscription> inscriptions;
     private HashMap<Inscription,UniteEnseignement> ueinscrits;
     private List<Decision> decisions;
     private List<Note> notes;


    public UEchoisie() {
    }

    public UEchoisie(boolean validee, List<UniteEnseignement> uniteEnseignements, List<Inscription> inscriptions, HashMap<Inscription, UniteEnseignement> ueinscrits, List<Decision> decisions) {
        this.validee = validee;
        this.uniteEnseignements = uniteEnseignements;
        this.inscriptions = inscriptions;
        this.ueinscrits = ueinscrits;
        this.decisions = decisions;
    }

    public UEchoisie(boolean validee, List<UniteEnseignement> uniteEnseignements, List<Inscription> inscriptions, HashMap<Inscription, UniteEnseignement> ueinscrits, List<Decision> decisions, List<Note> notes) {
        this.validee = validee;
        this.uniteEnseignements = uniteEnseignements;
        this.inscriptions = inscriptions;
        this.ueinscrits = ueinscrits;
        this.decisions = decisions;
        this.notes = notes;
    }

    public boolean isValidee() {
        return validee;
    }

    public void setValidee(boolean validee) {
        this.validee = validee;
    }

    public List<UniteEnseignement> getUniteEnseignements() {
        return uniteEnseignements;
    }

    public void setUniteEnseignements(List<UniteEnseignement> uniteEnseignements) {
        this.uniteEnseignements = uniteEnseignements;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public HashMap<Inscription, UniteEnseignement> getUeinscrits() {
        return ueinscrits;
    }

    public void setUeinscrits(HashMap<Inscription, UniteEnseignement> ueinscrits) {
        this.ueinscrits = ueinscrits;
    }

    public List<Decision> getDecisions() {
        return decisions;
    }

    public void setDecisions(List<Decision> decisions) {
        this.decisions = decisions;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.validee ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.uniteEnseignements);
        hash = 89 * hash + Objects.hashCode(this.inscriptions);
        hash = 89 * hash + Objects.hashCode(this.ueinscrits);
        hash = 89 * hash + Objects.hashCode(this.decisions);
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
        final UEchoisie other = (UEchoisie) obj;
        if (this.validee != other.validee) {
            return false;
        }
        if (!Objects.equals(this.uniteEnseignements, other.uniteEnseignements)) {
            return false;
        }
        if (!Objects.equals(this.inscriptions, other.inscriptions)) {
            return false;
        }
        if (!Objects.equals(this.ueinscrits, other.ueinscrits)) {
            return false;
        }
        return Objects.equals(this.decisions, other.decisions);
    }
     
}
