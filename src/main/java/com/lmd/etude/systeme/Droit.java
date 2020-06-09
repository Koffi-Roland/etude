/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.systeme;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Droit implements Serializable {
    
    private Long id;
    
    private String codeDroit;
    
    private String libelleDroit;

    public Droit() {
    }

    public Droit(Long id, String codeDroit, String libelleDroit) {
        this.id = id;
        this.codeDroit = codeDroit;
        this.libelleDroit = libelleDroit;
    }

    public Droit(String codeDroit, String libelleDroit) {
        this.codeDroit = codeDroit;
        this.libelleDroit = libelleDroit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeDroit() {
        return codeDroit;
    }

    public void setCodeDroit(String codeDroit) {
        this.codeDroit = codeDroit;
    }

    public String getLibelleDroit() {
        return libelleDroit;
    }

    public void setLibelleDroit(String libelleDroit) {
        this.libelleDroit = libelleDroit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.codeDroit);
        hash = 47 * hash + Objects.hashCode(this.libelleDroit);
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
        final Droit other = (Droit) obj;
        if (!Objects.equals(this.codeDroit, other.codeDroit)) {
            return false;
        }
        if (!Objects.equals(this.libelleDroit, other.libelleDroit)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
    
}
