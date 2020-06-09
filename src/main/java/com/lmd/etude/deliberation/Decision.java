/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.deliberation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Decision implements Serializable{
    private Long id;
    private String codeDecision;
    private List<String> noteDecision;
    private Date dateDecision;

    public Decision() {
    }

    public Decision(Long id, String codeDecision, List<String> noteDecision, Date dateDecision) {
        this.id = id;
        this.codeDecision = codeDecision;
        this.noteDecision = noteDecision;
        this.dateDecision = dateDecision;
    }

    public Decision(String codeDecision, List<String> noteDecision, Date dateDecision) {
        this.codeDecision = codeDecision;
        this.noteDecision = noteDecision;
        this.dateDecision = dateDecision;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeDecision() {
        return codeDecision;
    }

    public void setCodeDecision(String codeDecision) {
        this.codeDecision = codeDecision;
    }

    public List<String> getNoteDecision() {
        return noteDecision;
    }

    public void setNoteDecision(List<String> noteDecision) {
        this.noteDecision = noteDecision;
    }

    public Date getDateDecision() {
        return dateDecision;
    }

    public void setDateDecision(Date dateDecision) {
        this.dateDecision = dateDecision;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.codeDecision);
        hash = 83 * hash + Objects.hashCode(this.noteDecision);
        hash = 83 * hash + Objects.hashCode(this.dateDecision);
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
        final Decision other = (Decision) obj;
        if (!Objects.equals(this.codeDecision, other.codeDecision)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.noteDecision, other.noteDecision)) {
            return false;
        }
        return Objects.equals(this.dateDecision, other.dateDecision);
    }
    
}
