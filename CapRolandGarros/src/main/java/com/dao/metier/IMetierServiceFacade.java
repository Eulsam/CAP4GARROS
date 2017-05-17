/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.metier;

import com.dao.service.IArbitreDAO;
import com.dao.service.ICourtDAO;
import com.dao.service.IJoueurDAO;
import com.dao.service.IMatchsDAO;
import com.dao.service.IParticiperDAO;
import com.dao.service.IPersonneDAO;

/**
 *
 * @author etudiant
 */
public interface IMetierServiceFacade {
    public IArbitreDAO getArbitreDAO();
    public ICourtDAO getCourtDAO();
    public IJoueurDAO getJoueurDAO();
    public IMatchsDAO getMatchDAO();
    public IPersonneDAO getPersonneDAO();
    public IParticiperDAO getParticiperDAO();
}
