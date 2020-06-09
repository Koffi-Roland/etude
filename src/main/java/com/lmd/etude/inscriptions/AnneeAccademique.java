/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.inscriptions;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class AnneeAccademique {
    
    private Long id;
    private String code;
    private String libelle;
    private Date debut;
    private Date fin;
    private List<Periode> periode;

    public AnneeAccademique() {
    }

    public AnneeAccademique(Long id, String code, String libelle, Date debut, Date fin, List<Periode> periode) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
        this.debut = debut;
        this.fin = fin;
        this.periode = periode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public List<Periode> getPeriode() {
        return periode;
    }

    public void setPeriode(List<Periode> periode) {
        this.periode = periode;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.code);
        hash = 67 * hash + Objects.hashCode(this.libelle);
        hash = 67 * hash + Objects.hashCode(this.debut);
        hash = 67 * hash + Objects.hashCode(this.fin);
        hash = 67 * hash + Objects.hashCode(this.periode);
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
        final AnneeAccademique other = (AnneeAccademique) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
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
        return Objects.equals(this.periode, other.periode);
    }
    
}
