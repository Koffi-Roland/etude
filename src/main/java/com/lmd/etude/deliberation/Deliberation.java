/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.deliberation;

import com.lmd.etude.inscriptions.UniteEnseignement;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Deliberation {
    
    private Long id;
    private String codeDeliberation;
    private String libelleDeliberation;
    private List<Decision> decision;
    
    private UniteEnseignement uniteEnseignement;

    public Deliberation() {
    }

    public Deliberation(Long id, String codeDeliberation, String libelleDeliberation, List<Decision> decision, UniteEnseignement uniteEnseignement) {
        this.id = id;
        this.codeDeliberation = codeDeliberation;
        this.libelleDeliberation = libelleDeliberation;
        this.decision = decision;
        this.uniteEnseignement = uniteEnseignement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeDeliberation() {
        return codeDeliberation;
    }

    public void setCodeDeliberation(String codeDeliberation) {
        this.codeDeliberation = codeDeliberation;
    }

    public String getLibelleDeliberation() {
        return libelleDeliberation;
    }

    public void setLibelleDeliberation(String libelleDeliberation) {
        this.libelleDeliberation = libelleDeliberation;
    }

    public List<Decision> getDecision() {
        return decision;
    }

    public void setDecision(List<Decision> decision) {
        this.decision = decision;
    }

    public UniteEnseignement getUniteEnseignement() {
        return uniteEnseignement;
    }

    public void setUniteEnseignement(UniteEnseignement uniteEnseignement) {
        this.uniteEnseignement = uniteEnseignement;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.codeDeliberation);
        hash = 29 * hash + Objects.hashCode(this.libelleDeliberation);
        hash = 29 * hash + Objects.hashCode(this.decision);
        hash = 29 * hash + Objects.hashCode(this.uniteEnseignement);
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
        final Deliberation other = (Deliberation) obj;
        if (!Objects.equals(this.codeDeliberation, other.codeDeliberation)) {
            return false;
        }
        if (!Objects.equals(this.libelleDeliberation, other.libelleDeliberation)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.decision, other.decision)) {
            return false;
        }
        if (!Objects.equals(this.uniteEnseignement, other.uniteEnseignement)) {
            return false;
        }
        return true;
    }
    
}
