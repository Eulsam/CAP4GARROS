/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.metier;

import com.dao.service.AbstractDaoFactory;
import com.dao.service.AbstractDaoFactory.FactoryType;
import com.dao.service.IArbitreDAO;
import com.dao.service.ICourtDAO;
import com.dao.service.IJoueurDAO;
import com.dao.service.IMatchsDAO;
import com.dao.service.IParticiperDAO;
import com.dao.service.IPersonneDAO;
import com.dao.service.PersonneDAO;

/**
 *
 * @author etudiant
 */
public class MetierServiceFacade implements IMetierServiceFacade{
    
    private final FactoryType DEFAULT_IMPLEMENTATION =AbstractDaoFactory.FactoryType.JPA_DAO_FACTORY;



   public MetierServiceFacade() {
        // mettre tous les DAO
        personneDAO = AbstractDaoFactory.getFactory(DEFAULT_IMPLEMENTATION).getPersonneDAO();
    }

   public MetierServiceFacade(FactoryType factoryType) {
        // mettre tous les DAO
        personneDAO = AbstractDaoFactory.getFactory(factoryType).getPersonneDAO();
    }
    
    @Override
    public IArbitreDAO getArbitreDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICourtDAO getCourtDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IJoueurDAO getJoueurDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IMatchsDAO getMatchDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

private IPersonneDAO personneDAO = null;
    @Override
    public IPersonneDAO getPersonneDAO() {
        return personneDAO;
    }

    @Override
    public IParticiperDAO getParticiperDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
