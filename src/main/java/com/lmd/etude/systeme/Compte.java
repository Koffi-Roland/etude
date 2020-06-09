/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.systeme;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Compte implements Serializable {
    
    private Long id;
    private String motDePasse;
    private String nomUtilisateur;
    private Date dateCreation;
    private boolean etat;
    private Profil profil;

    public Compte() {
    }

    public Compte(Long id, String motDePasse, String nomUtilisateur, Date dateCreation, boolean etat) {
        this.id = id;
        this.motDePasse = motDePasse;
        this.nomUtilisateur = nomUtilisateur;
        this.dateCreation = dateCreation;
        this.etat = etat;
    }

    public Compte(Long id, String motDePasse, String nomUtilisateur, Date dateCreation, boolean etat, Profil profil) {
        this.id = id;
        this.motDePasse = motDePasse;
        this.nomUtilisateur = nomUtilisateur;
        this.dateCreation = dateCreation;
        this.etat = etat;
        this.profil = profil;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.motDePasse);
        hash = 97 * hash + Objects.hashCode(this.nomUtilisateur);
        hash = 97 * hash + Objects.hashCode(this.dateCreation);
        hash = 97 * hash + (this.etat ? 1 : 0);
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
        final Compte other = (Compte) obj;
        if (this.etat != other.etat) {
            return false;
        }
        if (!Objects.equals(this.motDePasse, other.motDePasse)) {
            return false;
        }
        if (!Objects.equals(this.nomUtilisateur, other.nomUtilisateur)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.dateCreation, other.dateCreation);
    }
    
    
}
