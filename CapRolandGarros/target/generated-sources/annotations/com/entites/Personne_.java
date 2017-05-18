package com.entites;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Personne.class)
public abstract class Personne_ {

	public static volatile SingularAttribute<Personne, Arbitre> arbitre;
	public static volatile ListAttribute<Personne, Participer> participerList;
	public static volatile SingularAttribute<Personne, Joueur> joueur;
	public static volatile SingularAttribute<Personne, Integer> idPersonne;
	public static volatile SingularAttribute<Personne, String> nationnalite;
	public static volatile SingularAttribute<Personne, String> nom;
	public static volatile SingularAttribute<Personne, String> prenom;
	public static volatile SingularAttribute<Personne, Integer> version;

}

