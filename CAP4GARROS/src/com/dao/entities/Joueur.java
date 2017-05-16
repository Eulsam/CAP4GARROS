/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ElHadji
 */
@Entity
@Table(name = "personne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p"),
    @NamedQuery(name = "Personne.findByIdPersonne", query = "SELECT p FROM Personne p WHERE p.idPersonne = :idPersonne"),
    @NamedQuery(name = "Personne.findByPrenom", query = "SELECT p FROM Personne p WHERE p.prenom = :prenom"),
    @NamedQuery(name = "Personne.findByNom", query = "SELECT p FROM Personne p WHERE p.nom = :nom"),
    @NamedQuery(name = "Personne.findByPrenomNom", query = "SELECT p FROM Personne p WHERE CONCAT(prenom, nom) LIKE :prenomNom"),    
    @NamedQuery(name = "Personne.findByPays", query = "SELECT p FROM Personne p WHERE p.pays = :pays")})
public class Joueur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idJoueur")
    private Integer idJoueur;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "nom")
    private String nom;
    @Column(name = "sexe")
    private String sexe;    
    @Column(name = "nation")
    private String pays;
    @Column(name = "version")
    @Version
    private Integer version;

    public Joueur() {
    }

    public Joueur(String prenom, String nom, String sexe, String pays) {
        this.prenom = prenom;
        this.nom = nom; 
        this.sexe = sexe;
        this.pays = pays;
    }

    public Joueur(int idJoueur, String prenom, String nom, double poids, double taille, String rue, String ville, String codePostal, String pays) {
        this.idJoueur = idJoueur;
        this.prenom = prenom;
        this.nom = nom;      
        this.pays = pays;
    }

    public Joueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Integer getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public String getSexe() {
        return sexe;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJoueur != null ? idJoueur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joueur)) {
            return false;
        }
        Joueur other = (Joueur) object;
        if ((this.idJoueur == null && other.idJoueur != null) || (this.idJoueur != null && !this.idJoueur.equals(other.idJoueur))) {
            return false;
        }
        return true;
    }

    @Override

    public String toString() {
        return String.format("[idJoueur=%s, prenom=%s, nom=%s, sexe=%s, pays=%s, version=%s]", idJoueur, prenom, nom, sexe, pays, version);
    }
}
