/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.inscriptions;

import com.lmd.etude.interfaces.IEnseignant;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HP
 */
public class Enseignant extends Personne implements Serializable,IEnseignant{
    
    private String numeroMatricule;
    private List<UniteEnseignement> uniteEnseignement;

    public Enseignant(Long id, String numeroMatricule, List<UniteEnseignement> uniteEnseignement) {
        this.id = id;
        this.numeroMatricule = numeroMatricule;
        this.uniteEnseignement = uniteEnseignement;
    }

    public Enseignant(Long id, String numeroMatricule, List<UniteEnseignement> uniteEnseignement, String nom, String prenom, Date dateNaissance, String lieuNaissance) {
        super(nom, prenom, dateNaissance, lieuNaissance);
        this.id = id;
        this.numeroMatricule = numeroMatricule;
        this.uniteEnseignement = uniteEnseignement;
    }


    public String getNumeroMatricule() {
        return numeroMatricule;
    }

    public void setNumeroMatricule(String numeroMatricule) {
        this.numeroMatricule = numeroMatricule;
    }

    public List<UniteEnseignement> getUniteEnseignement() {
        return uniteEnseignement;
    }

    public void setUniteEnseignement(List<UniteEnseignement> uniteEnseignement) {
        this.uniteEnseignement = uniteEnseignement;
    }



    public Enseignant() {
    }

    @Override
    public void affiche() {
                System.out.println( "numero matricule:"+this.numeroMatricule+"nom:"+this.nom);

    }

    @Override
    public Optional<Enseignant> updateEnseignant(Enseignant _enseignant) {
 return Optional.of(_enseignant)
                .map((Enseignant enseignant) -> {
                    enseignant.setNom(_enseignant.getNom() );
                    enseignant.setDateNaissance(_enseignant.getDateNaissance());
                    enseignant.setPrenom(_enseignant.getPrenom());
                    enseignant.setNumeroMatricule(_enseignant.getNumeroMatricule());
                    
                    return enseignant;
        });    }

    @Override
    public Enseignant saveEnseignant(Enseignant enseignantDto) {
   Enseignant enseignant=new Enseignant();
        enseignant.setNom(enseignantDto.getNom());
        enseignant.setNumeroMatricule(enseignantDto.getNumeroMatricule());
        enseignant.setPrenom(enseignantDto.getPrenom());
        enseignant.setLieuNaissance(enseignantDto.getLieuNaissance());
        enseignant.setUniteEnseignement(enseignantDto.getUniteEnseignement());
        return enseignant;
    }
    
// method sera utile quand on implementera les interface du repository(requête)

    @Override
    public void deleteEnseigant(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
