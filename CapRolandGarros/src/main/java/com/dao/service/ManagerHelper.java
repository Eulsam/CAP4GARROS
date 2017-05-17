/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author etudiant
 */
public class ManagerHelper {

    protected static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("RolandGarrosPU");
            
            
    public static EntityManager createEntityManager() {
        EntityManager em = emf.createEntityManager();
        return em;
    }

     public static void beginTransaction(EntityManager em) {
         if(em!=null){
             em.getTransaction().begin();
         }
    }
     
     public static void commitTransaction(EntityManager em) {
        if(em!=null){
            em.getTransaction().commit();
        }
    }

     
    public static void rollBackTransaction (EntityManager em) {
        if (em!= null){
            em.getTransaction().rollback();
        }
    }
     
      public static void closeEntityManager(EntityManager em) {
        if (em != null){
            em.close();
        }
    }  
}
