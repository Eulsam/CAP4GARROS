/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.service;

import com.entites.Arbitre;
import com.entites.Court;
import com.entites.Joueur;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author etudiant
 */
public class GenericDAO implements IGenericDAO {

    public String className = GenericDAO.class.getName();

    @Override
    public Object create(Object obj) {
        String methodName = "create";
        try {
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                ManagerHelper.beginTransaction(em);
                em.persist(obj);
                ManagerHelper.commitTransaction(em);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , Created Object : " + obj);
        return obj;
    }

    @Override
    public Object update(Object obj) {
        String methodName = "update";
        try {
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                ManagerHelper.beginTransaction(em);
                em.merge(obj);
                ManagerHelper.commitTransaction(em);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , Updated Object : " + obj);
        return obj;
    }

    @Override
    public boolean delete(Object obj) {
        String methodName = "delete";
        boolean isOk = false;
        try {
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                ManagerHelper.beginTransaction(em);
                em.remove(em.merge(obj));
                isOk = true;
                ManagerHelper.commitTransaction(em);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , isOk : " + isOk);
        return isOk;
    }

    protected List findByCriteria(Class myClass, String namedQuery, Map<String, Object> parameters) {
        String methodName = "findByCriteria";
        List entities = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass : " + myClass + " , namedQuery : " + namedQuery + " , parameters : " + parameters);
            if (namedQuery != null && parameters != null && !parameters.isEmpty()) {
                EntityManager em = ManagerHelper.createEntityManager();
                if (em != null) {
                    Query queryParams = em.createNamedQuery(myClass.getSimpleName() + "." + namedQuery);
                   for(Map.Entry<String, Object> entry : parameters.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        queryParams.setParameter(key, value);
                    }
                    entities = queryParams.getResultList();
                    ManagerHelper.closeEntityManager(em);
                }
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , entities : " + entities);
        return entities;
    }

    @Override
    public Object findBySexe(Class myClass, String sexe) {
        String methodName = "findBySexe";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , sexe ! " + sexe);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, sexe);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByIdCourt(Class myClass, Integer idCourt) {
        String methodName = "findByIdCourt";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , idCourt ! " + idCourt);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, idCourt);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByIdJoueur(Class myClass, Integer idJoueur) {
        String methodName = "findByIdJoueur";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , idJoueur ! " + idJoueur);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, idJoueur);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByIdMatch(Class myClass, Integer idMatch) {
        String methodName = "findByIdMatch";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , idMatch ! " + idMatch);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, idMatch);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByIdArbitre(Class myClass, Integer idArbitre) {
        String methodName = "findByIdArbitre";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , idArbitre ! " + idArbitre);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, idArbitre);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByIdOrganisateur(Class myClass, Integer idOrganisateur) {
        String methodName = "findByIdOrganisateur";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , idArbitidOrganisateurre ! " + idOrganisateur);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, idOrganisateur);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByNomArbitre(Class myClass, String nom) {
        String methodName = "findByNomArbitre";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , nom de l'Arbitre ! " + nom);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, nom);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByPrenomArbitre(Class myClass, String prenom) {
        String methodName = "findByPrenomArbitre";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , prénom de l'Arbitre ! " + prenom);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, prenom);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByNomJoueur(Class myClass, String nom) {
        String methodName = "findByNomJoueur";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , nom du Joueur ! " + nom);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, nom);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByPrenomJoueur(Class myClass, String prenom) {
        String methodName = "findByPrenomJoueur";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , prénom du joueur ! " + prenom);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, prenom);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByNomCourt(Class myClass, String nom) {
        String methodName = "findByNomCourt";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , nom du Court ! " + nom);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, nom);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    public Object findByNationnalite(Class myClass, String nationnalite) {
        String methodName = "findByNationnalite";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , nationalité du Joueur ! " + nationnalite);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, nationnalite);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByCalendrier(Class myClass, Date calendrier) {
        String methodName = "findByCalendrier";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , jour du match! " + calendrier);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, calendrier);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

    @Override
    public Object findByHeure(Class myClass, Time heureDebut, Time heureFin) {
        String methodName = "findByHeure";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , heure de début du match! " + heureFin);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, heureFin);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }

   /*@Override
    public Object findByResultat(Class myClass, String equipe1, String equipe2, Integer resultatEquipe1, Integer resultatEquipe2) {
        String methodName = "findByResultat";
        Object obj = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , nom de l'équipe 1! " + equipe1 + " , nome de l'équipe 2 " + equipe2 + " a pour résultat " + resultatEquipe1 + " " + resultatEquipe2);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                obj = em.find(myClass, equipe1, equipe2);
                obj = em.find(resultatEquipe1, resultatEquipe2);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , obj ! " + obj);
        return obj;
    }*/

    @Override
    public Object findByEtatCourt(Class myClass, boolean etatCourt) {
        String methodName = "findByEtatCourt";
        boolean isDisponible = false;
        try {
            System.out.println(className + " --> " + methodName + " , myClass ! " + myClass + " , disponibilité du terrain! " + etatCourt);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                
                isDisponible = (boolean) em.find(myClass, etatCourt);
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , disponibilité ! " + isDisponible);
        return isDisponible;
    }

    @Override
    public List<Joueur> findByAllJoueur(Class myClass) {
        String methodName = "findByAllJoueur";
        List entities = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass : " + myClass);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                entities = em.createNamedQuery(myClass.getSimpleName() + ".findByAllJoueur").getResultList();
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , entities : " + entities);
        return entities;
    }

    @Override
    public List<Court> findByAllCourt(Class myClass) {
        String methodName = "findByAllCourt";
        List entities = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass : " + myClass);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                entities = em.createNamedQuery(myClass.getSimpleName() + ".findByAllCourt").getResultList();
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , entities : " + entities);
        return entities;
    }

    @Override
    public List<Arbitre> findByAllArbitre(Class myClass) {
        String methodName = "findByAllArbitre";
        List entities = null;
        try {
            System.out.println(className + " --> " + methodName + " , myClass : " + myClass);
            EntityManager em = ManagerHelper.createEntityManager();
            if (em != null) {
                entities = em.createNamedQuery(myClass.getSimpleName() + ".findByAllArbitre").getResultList();
                ManagerHelper.closeEntityManager(em);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'execution de la methode : " + methodName + " , Exception : " + e);
        }
        System.out.println(className + " --> " + methodName + " , entities : " + entities);
        return entities;
    }
}
