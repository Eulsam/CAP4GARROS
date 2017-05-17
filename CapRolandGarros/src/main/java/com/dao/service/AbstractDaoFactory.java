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
public abstract class AbstractDaoFactory {
    
    public static String className = AbstractDaoFactory.class.getName();
    
    public enum FactoryType{
        JPA_DAO_FACTORY;
    }
    
    /*Exemple */
    public abstract PersonneDAO getPersonneDAO();
    
    public static AbstractDaoFactory getFactory(FactoryType type) {
        String methodName = "getFactory";
        AbstractDaoFactory factory = null;
        System.out.println(className +" --> " + methodName + " , FactoryType "+ type);
        if (FactoryType.JPA_DAO_FACTORY.equals(type)){
            factory = new JpaDaoFactory();
        }
        if (factory == null){
            factory = new JpaDaoFactory();
        }
        return factory;
    }
}
