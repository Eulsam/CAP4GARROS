/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.main;

import com.dao.metier.IMetierServiceFacade;
import com.dao.metier.MetierServiceFactory;
import com.entites.Personne;
import java.util.List;
/**
 *
 * @author etudiant
 */
public class Tournoi {
 
    public static void main (String[] args){

        IMetierServiceFacade metierServiceFacade = MetierServiceFactory.getDefaultMetierFacade();
        List<Personne> personnes = metierServiceFacade.getPersonneDAO().findByNationalite("FRA");
        System.out.println("Les personnes de nationalité française " + personnes+ " a été trouvée.");
    }
}
