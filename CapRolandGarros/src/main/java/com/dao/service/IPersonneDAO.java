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

    public List<Personne> findByNationnalite(String nationnalite);
}
