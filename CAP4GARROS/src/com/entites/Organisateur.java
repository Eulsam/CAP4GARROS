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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author etudiant
 */
@Entity
@Table(name = "organisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Organisateur.findAll", query = "SELECT o FROM Organisateur o"),
    @NamedQuery(name = "Organisateur.findByIdOrganisateur", query = "SELECT o FROM Organisateur o WHERE o.idOrganisateur = :idOrganisateur"),
    @NamedQuery(name = "Organisateur.findByNom", query = "SELECT o FROM Organisateur o WHERE o.nom = :nom"),
    @NamedQuery(name = "Organisateur.findByMotDePasse", query = "SELECT o FROM Organisateur o WHERE o.motDePasse = :motDePasse"),
    @NamedQuery(name = "Organisateur.findByVersion", query = "SELECT o FROM Organisateur o WHERE o.version = :version")})
public class Organisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdOrganisateur")
    private Integer idOrganisateur;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "MotDePasse")
    private String motDePasse;
    @Column(name = "Version")
    private Integer version;

    public Organisateur() {
    }

    public Organisateur(Integer idOrganisateur) {
        this.idOrganisateur = idOrganisateur;
    }

    public Integer getIdOrganisateur() {
        return idOrganisateur;
    }

    public void setIdOrganisateur(Integer idOrganisateur) {
        this.idOrganisateur = idOrganisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
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
        hash += (idOrganisateur != null ? idOrganisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organisateur)) {
            return false;
        }
        Organisateur other = (Organisateur) object;
        if ((this.idOrganisateur == null && other.idOrganisateur != null) || (this.idOrganisateur != null && !this.idOrganisateur.equals(other.idOrganisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entites.Organisateur[ idOrganisateur=" + idOrganisateur + " ]";
    }
    
}
