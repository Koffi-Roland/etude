/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.etude.inscriptions;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Uea extends UniteEnseignement implements Serializable{

    @Override
    public void affiche() {
        
                System.out.println( "code:"+this.code+"nom:"+this.libelle);
    }
    
}
