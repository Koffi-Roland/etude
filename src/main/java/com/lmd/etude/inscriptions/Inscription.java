/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.inscriptions;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Inscription {
    private Long id;
    private Date date;
    private Periode periode;
    private Semestre semestre;
    private Parcours parcours;

    public Inscription() {
    }

    public Inscription(Long id, Date date, Periode periode, Semestre semestre, Parcours parcours) {
        this.id = id;
        this.date = date;
        this.periode = periode;
        this.semestre = semestre;
        this.parcours = parcours;
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

    public Periode getPeriode() {
        return periode;
    }

    public void setPeriode(Periode periode) {
        this.periode = periode;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Parcours getParcours() {
        return parcours;
    }

    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.date);
        hash = 47 * hash + Objects.hashCode(this.periode);
        hash = 47 * hash + Objects.hashCode(this.semestre);
        hash = 47 * hash + Objects.hashCode(this.parcours);
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
        final Inscription other = (Inscription) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.periode, other.periode)) {
            return false;
        }
        if (!Objects.equals(this.semestre, other.semestre)) {
            return false;
        }
        return Objects.equals(this.parcours, other.parcours);
    }
    
    
    
    
}
