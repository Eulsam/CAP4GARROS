/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.service;

/**
 *
 * @author etudiant
 */
class JpaDaoFactory extends AbstractDaoFactory {


    public PersonneDAO getPersonneDAO() {
        return new PersonneDAO();
    }
    
}
