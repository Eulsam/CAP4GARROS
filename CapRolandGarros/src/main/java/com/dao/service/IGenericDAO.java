/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.service;

import com.entites.Arbitre;
import com.entites.Court;
import com.entites.Joueur;
import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author etudiant
 */
public interface IGenericDAO {

    Object create(Object obj);

    Object update(Object obj);

    boolean delete(Object obj);

    Object findBySexe(Class myClass, String sexe);

    Object findByIdCourt(Class myClass, Integer idCourt);

    Object findByIdJoueur(Class myClass, Integer idJoueur);

    Object findByIdMatch(Class myClass, Integer idMatch);

    Object findByIdArbitre(Class myClass, Integer idArbitre);

    Object findByIdOrganisateur(Class myClass, Integer idOrganisateur);

    Object findByNomArbitre(Class myClass, String nom);

    Object findByPrenomArbitre(Class myClass, String prenom);

    Object findByNomJoueur(Class myClass, String nom);

    Object findByPrenomJoueur(Class myClass, String prenom);

    Object findByNomCourt(Class myClass, String nom);

    Object findByNationalite(Class myClass, String nationalite);
    
    Object findByCalendrier (Class myClass, Date calendrier);
    
    Object findByHeure (Class myClass, Time heureDebut, Time heureFin);
    
    /*Object findByResultat (Class myClass, String equipe1, String equipe2, Integer resultatEquipe1, Integer resultatEquipe2);*/
    
    Object findByEtatCourt (Class myClass, boolean etatCourt);
    
    List<Joueur> findByAllJoueur (Class myClass);
    
    List<Court> findByAllCourt (Class myClass);
    
    List<Arbitre> findByAllArbitre (Class myClass);
    
}