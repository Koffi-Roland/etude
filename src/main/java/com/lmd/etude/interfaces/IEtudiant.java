/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.interfaces;

import com.lmd.etude.inscriptions.Etudiant;
import com.lmd.etude.inscriptions.Parcours;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HP
 */
public interface IEtudiant {
    

    public Optional<Etudiant> updateEtudiant(Etudiant etudiant);

    public Etudiant saveEtudiant(Etudiant etudiant);
    
    public Etudiant getOneEtudiant(Long id);

    public void deleteEtudiant(Long id);
    
    public List<Parcours> getParcoursEtudiant(String numeroCarte);
   
    public List<String> getListelibelleParcoursEtudiant();
}
