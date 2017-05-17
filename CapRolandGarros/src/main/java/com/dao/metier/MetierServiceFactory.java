/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.metier;

/**
 *
 * @author etudiant
 */
public class MetierServiceFactory {

    private static IMetierServiceFacade getMetierServiceFacade(FactoryType factoryType) {
        IMetierServiceFacade metierServiceFacade = null;
        if(factoryType==FactoryType.DEFAULT_METIER_SERVICE){
            metierServiceFacade = new MetierServiceFacade();
        }
        return metierServiceFacade;
    }

    public enum FactoryType {
        DEFAULT_METIER_SERVICE;
    }
    public static IMetierServiceFacade getDefaultMetierFacade() {
        return getMetierServiceFacade(FactoryType.DEFAULT_METIER_SERVICE);
    }
    
}
