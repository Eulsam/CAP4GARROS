/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.service;

import com.entites.Personne;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author etudiant
 */
public class PersonneDAO extends GenericDAO implements IPersonneDAO {

    @Override
    public List<Personne> findByNationnalite(final String nationnalite) {
        return findByCriteria(Personne.class, "findByNationnalite", new HashMap() {
            {
                put("nationalite", nationnalite);
            }
        });
    }
}
