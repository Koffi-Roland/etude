/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.inscriptions;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Parcours implements Serializable {
    
    private Long id;
    private String libelle;
    private String grade;
    private List<Etudiant> etudiants;
    private List<Inscription> inscripitions;

    public Parcours() {
    }

    public Parcours(Long id, String libelle, String grade) {
        this.id = id;
        this.libelle = libelle;
        this.grade = grade;
    }

    public Parcours(Long id, String libelle, String grade, List<Etudiant> etudiants) {
        this.id = id;
        this.libelle = libelle;
        this.grade = grade;
        this.etudiants = etudiants;
    }

    public Long getId() {
        return id;
    }

    public List<Inscription> getInscripitions() {
        return inscripitions;
    }

    public void setInscripitions(List<Inscription> inscripitions) {
        this.inscripitions = inscripitions;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.libelle);
        hash = 47 * hash + Objects.hashCode(this.grade);
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
        final Parcours other = (Parcours) obj;
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        if (!Objects.equals(this.grade, other.grade)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
    
}
