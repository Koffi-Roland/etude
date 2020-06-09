/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.inscriptions;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Semestre implements Serializable {
    
    private Long id;
    private String libelle;
    private Date debut;
    private Date fin;
    private Long numero;
    private List<Inscription> isncriptions;

    public Semestre() {
    }

    public Semestre(String libelle, Date debut, Date fin, Long numero) {
        this.libelle = libelle;
        this.debut = debut;
        this.fin = fin;
        this.numero = numero;
    }

    public Semestre(Long id, String libelle, Date debut, Date fin, Long numero) {
        this.id = id;
        this.libelle = libelle;
        this.debut = debut;
        this.fin = fin;
        this.numero = numero;
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

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public List<Inscription> getIsncriptions() {
        return isncriptions;
    }

    public void setIsncriptions(List<Inscription> isncriptions) {
        this.isncriptions = isncriptions;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.libelle);
        hash = 97 * hash + Objects.hashCode(this.debut);
        hash = 97 * hash + Objects.hashCode(this.fin);
        hash = 97 * hash + Objects.hashCode(this.numero);
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
        final Semestre other = (Semestre) obj;
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.debut, other.debut)) {
            return false;
        }
        if (!Objects.equals(this.fin, other.fin)) {
            return false;
        }
        return Objects.equals(this.numero, other.numero);
    }

    
}
