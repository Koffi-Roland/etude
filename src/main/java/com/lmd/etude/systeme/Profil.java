/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.systeme;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Profil implements Serializable {

    private Long id;
    private String codeProfil;
    private String libelleProfil;
    private HashMap<String, String> listeDroit;

    public Profil() {
    }

    public Profil(String codeProfil, String libelleProfil) {
        this.codeProfil = codeProfil;
        this.libelleProfil = libelleProfil;
    }

    public Profil(Long id, String codeProfil, String libelleProfil) {
        this.id = id;
        this.codeProfil = codeProfil;
        this.libelleProfil = libelleProfil;
    }

    public Profil(Long id, String codeProfil, String libelleProfil, HashMap<String, String> listeDroit) {
        this.id = id;
        this.codeProfil = codeProfil;
        this.libelleProfil = libelleProfil;
        this.listeDroit = listeDroit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeProfil() {
        return codeProfil;
    }

    public void setCodeProfil(String codeProfil) {
        this.codeProfil = codeProfil;
    }

    public String getLibelleProfil() {
        return libelleProfil;
    }

    public void setLibelleProfil(String libelleProfil) {
        this.libelleProfil = libelleProfil;
    }

    public HashMap<String, String> getListeDroit() {
        return listeDroit;
    }

    public void setListeDroit(HashMap<String, String> listeDroit) {
        this.listeDroit = listeDroit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.codeProfil);
        hash = 59 * hash + Objects.hashCode(this.libelleProfil);
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
        final Profil other = (Profil) obj;
        if (!Objects.equals(this.codeProfil, other.codeProfil)) {
            return false;
        }
        if (!Objects.equals(this.libelleProfil, other.libelleProfil)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

}
