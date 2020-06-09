/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.deliberation;

import com.lmd.etude.inscriptions.Enseignant;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Jury  implements Serializable{
    private Long id;
    private List<Deliberation> deliberation;
    private List<Enseignant> enseignant;

    public Jury() {
    }

    public Jury(Long id, List<Deliberation> deliberation, List<Enseignant> enseignant) {
        this.id = id;
        this.deliberation = deliberation;
        this.enseignant = enseignant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Deliberation> getDeliberation() {
        return deliberation;
    }

    public void setDeliberation(List<Deliberation> deliberation) {
        this.deliberation = deliberation;
    }

    public List<Enseignant> getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(List<Enseignant> enseignant) {
        this.enseignant = enseignant;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.deliberation);
        hash = 29 * hash + Objects.hashCode(this.enseignant);
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
        final Jury other = (Jury) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.deliberation, other.deliberation)) {
            return false;
        }
        if (!Objects.equals(this.enseignant, other.enseignant)) {
            return false;
        }
        return true;
    }
    
    
}
