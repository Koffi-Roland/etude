/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.deliberation;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Periode {
    private Long id;
    private String codePeriode;
    private String libellePeriode;
    private List<Deliberation> deliberation;

    public Periode() {
    }

    public Periode(Long id, String codePeriode, String libellePeriode, List<Deliberation> deliberation) {
        this.id = id;
        this.codePeriode = codePeriode;
        this.libellePeriode = libellePeriode;
        this.deliberation = deliberation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodePeriode() {
        return codePeriode;
    }

    public void setCodePeriode(String codePeriode) {
        this.codePeriode = codePeriode;
    }

    public String getLibellePeriode() {
        return libellePeriode;
    }

    public void setLibellePeriode(String libellePeriode) {
        this.libellePeriode = libellePeriode;
    }

    public List<Deliberation> getDeliberation() {
        return deliberation;
    }

    public void setDeliberation(List<Deliberation> deliberation) {
        this.deliberation = deliberation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.codePeriode);
        hash = 23 * hash + Objects.hashCode(this.libellePeriode);
        hash = 23 * hash + Objects.hashCode(this.deliberation);
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
        final Periode other = (Periode) obj;
        if (!Objects.equals(this.codePeriode, other.codePeriode)) {
            return false;
        }
        if (!Objects.equals(this.libellePeriode, other.libellePeriode)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.deliberation, other.deliberation);
    }
    
}
