/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.service;

import com.entites.Personne;
import java.util.List;

/**
 *
 * @author etudiant
 */
public interface IPersonneDAO {
 // chercher une Personne ayant nationalité particulière
 List<Personne> findByNationnalite(String nationnalite);
 // créer une nouvelle Personne
 Personne create(Personne person);
 // modifier une Personne existante
 boolean update(Personne person);
 // modifier une Personne existante et la retourner.
 Personne updateAndReturn(Personne person);
 // supprimer une Personne existante
 boolean delete(Personne person);
 // chercher une Personne particulière
 Personne find(Integer id);
 // obtenir tous les objets Personne
 List<Personne> findAll();

}
