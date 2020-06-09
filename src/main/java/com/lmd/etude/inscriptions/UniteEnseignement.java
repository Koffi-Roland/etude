/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.inscriptions;

/**
 *
 * @author HP
 */
public abstract class UniteEnseignement {
    
    protected Long id;
    protected String code;
    protected String libelle;
    protected Integer credit; 
    protected TypeUE typeUE;
    protected Enseignant enseignant;
    
    public abstract void affiche();


    public UniteEnseignement() {
    }
    
   
    public UniteEnseignement(Long id, String code, String libelle, Integer credit, TypeUE typeUE) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
        this.credit = credit;
        this.typeUE = typeUE;
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

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public TypeUE getTypeUE() {
        return typeUE;
    }

    public void setTypeUE(TypeUE typeUE) {
        this.typeUE = typeUE;
    }
    
    
}
