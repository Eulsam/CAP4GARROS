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
                put("nationnalite", nationnalite);
            }
        });
    }

    @Override
    public Personne create(Personne person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Personne person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personne updateAndReturn(Personne person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Personne person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personne find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personne> findAll() {
        /*return findByAll(Personne.class, "findByNationnalite", new HashMap() {
            {
                put("nationnalite", nationnalite);
            }
        });*/
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
