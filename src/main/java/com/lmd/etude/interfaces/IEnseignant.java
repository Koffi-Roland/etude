/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.interfaces;

import com.lmd.etude.inscriptions.Enseignant;
import java.util.Optional;

/**
 *
 * @author HP
 */
public interface IEnseignant {
    
    public Optional<Enseignant> updateEnseignant(Enseignant enseignant);

    public Enseignant saveEnseignant(Enseignant enseignant);

    public void deleteEnseigant(Long id); 
}
