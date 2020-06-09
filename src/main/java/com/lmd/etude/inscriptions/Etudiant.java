/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.inscriptions;

import com.lmd.etude.interfaces.IEtudiant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HP
 */
public class Etudiant extends Personne implements Serializable,IEtudiant{
    
    private String numeroCarte;
    private List<Parcours> parcours;

    public Etudiant() {
    }

    public Etudiant(String numeroCarte, String nom, String prenom, Date dateNaissance, String lieuNaissance) {
        super(nom, prenom, dateNaissance, lieuNaissance);
        this.numeroCarte = numeroCarte;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public List<Parcours> getParcours() {
        return parcours;
    }

    public void setParcours(List<Parcours> parcours) {
        this.parcours = parcours;
    }

    @Override
    public void affiche() {
        System.out.println( "numero Carte:"+this.numeroCarte+"nom:"+this.nom);
        }

    @Override
       public Optional<Etudiant> updateEtudiant(Etudiant _etudiant) {
        return Optional.of(_etudiant)
                .map((Etudiant etudiant) -> {
                    etudiant.setNom(_etudiant.getNom() );
                    etudiant.setDateNaissance(_etudiant.getDateNaissance());
                    etudiant.setPrenom(_etudiant.getPrenom());
                    etudiant.setNumeroCarte(_etudiant.getNumeroCarte());
                    
                    return etudiant;
        });
    }

    @Override
    public Etudiant saveEtudiant(Etudiant etudiantDto) {
        Etudiant etudiant=new Etudiant();
        etudiant.setNom(etudiantDto.getNom());
        etudiant.setNumeroCarte(etudiantDto.getNumeroCarte());
        etudiant.setPrenom(etudiantDto.getPrenom());
        etudiant.setLieuNaissance(etudiantDto.getLieuNaissance());
        etudiant.setParcours(etudiantDto.getParcours());
        return etudiant;   
    }

    
    // method sera utile quand on implementera les interface du repository(requête)
    @Override
    public Etudiant getOneEtudiant(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
        // method sera utile quand on implementera les interface du repository(requête)

    @Override
    public void deleteEtudiant(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

        // method sera utile quand on implementera les interface du repository(requête)
    
        @Override
    public List<Parcours> getParcoursEtudiant(String numeroCarte) {
                throw new UnsupportedOperationException("Not supported yet."); 

    }

    @Override
    public List<String> getListelibelleParcoursEtudiant() {
 List<String> listparcours = new ArrayList<>();

        parcours.forEach((_parcours) -> {
            listparcours.add(
                    "libelle: " + _parcours.getLibelle()
                    + "grade: " + _parcours.getGrade()
                    + " etudiants: " + _parcours.getEtudiants()
                    + "  \n");
        });
        return listparcours;  
    }

 
    
}
