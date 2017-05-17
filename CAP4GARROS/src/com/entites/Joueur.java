/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author etudiant
 */
@Entity
@Table(name = "joueur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joueur.findAll", query = "SELECT j FROM Joueur j"),
    @NamedQuery(name = "Joueur.findByIdJoueur", query = "SELECT j FROM Joueur j WHERE j.idJoueur = :idJoueur"),
    @NamedQuery(name = "Joueur.findBySexe", query = "SELECT j FROM Joueur j WHERE j.sexe = :sexe"),
    @NamedQuery(name = "Joueur.findByVersion", query = "SELECT j FROM Joueur j WHERE j.version = :version")})
public class Joueur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idJoueur")
    private Integer idJoueur;
    @Basic(optional = false)
    @Column(name = "Sexe")
    private String sexe;
    @Column(name = "Version")
    private Integer version;
    @JoinColumn(name = "idJoueur", referencedColumnName = "idPersonne", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Personne personne;

    public Joueur() {
    }

    public Joueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Joueur(Integer idJoueur, String sexe) {
        this.idJoueur = idJoueur;
        this.sexe = sexe;
    }

    public Integer getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
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
        return "com.entites.Joueur[ idJoueur=" + idJoueur + " ]";
    }
    
}
