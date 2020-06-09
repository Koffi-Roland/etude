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
public class Uec extends UniteEnseignement implements Serializable{

    private List<Uea> lisUea;

    public Uec() {
    }

    public Uec(List<Uea> lisUea) {
        this.lisUea = lisUea;
    }

    public Uec(List<Uea> lisUea, Long id, String code, String libelle, Integer credit, TypeUE typeUE) {
        super(id, code, libelle, credit, typeUE);
        this.lisUea = lisUea;
    }
    
    @Override
    public void affiche() {
                System.out.println( "code:"+this.code+"nom:"+this.libelle);
    }

    public List<Uea> getLisUea() {
        return lisUea;
    }

    public void setLisUea(List<Uea> lisUea) {
        this.lisUea = lisUea;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.lisUea);
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
        final Uec other = (Uec) obj;
        return Objects.equals(this.lisUea, other.lisUea);
    }
    
}
