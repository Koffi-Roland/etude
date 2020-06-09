/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.evaluations;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class RapportErreur implements Serializable{
    
    
    private Long id;
    private Date date;
    private List<Erreurs> erreurs;

    public RapportErreur() {
    }

    public RapportErreur(Long id, Date date, List<Erreurs> erreurs) {
        this.id = id;
        this.date = date;
        this.erreurs = erreurs;
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

    public List<Erreurs> getErreurs() {
        return erreurs;
    }

    public void setErreurs(List<Erreurs> erreurs) {
        this.erreurs = erreurs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.date);
        hash = 41 * hash + Objects.hashCode(this.erreurs);
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
        final RapportErreur other = (RapportErreur) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Objects.equals(this.erreurs, other.erreurs);
    }
    
    
}
