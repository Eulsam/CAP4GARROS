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
@Table(name = "court")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Court.findAll", query = "SELECT c FROM Court c"),
    @NamedQuery(name = "Court.findByIdCourt", query = "SELECT c FROM Court c WHERE c.idCourt = :idCourt"),
    @NamedQuery(name = "Court.findByNom", query = "SELECT c FROM Court c WHERE c.nom = :nom"),
    @NamedQuery(name = "Court.findByNumero", query = "SELECT c FROM Court c WHERE c.numero = :numero"),
    @NamedQuery(name = "Court.findByIdMatchs", query = "SELECT c FROM Court c WHERE c.idMatchs = :idMatchs"),
    @NamedQuery(name = "Court.findByEtatCourt", query = "SELECT c FROM Court c WHERE c.etatCourt = :etatCourt"),
    @NamedQuery(name = "Court.findByVersion", query = "SELECT c FROM Court c WHERE c.version = :version")})
public class Court implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCourt")
    private Integer idCourt;
    @Basic(optional = false)
    @Column(name = "Nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "Numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "id_Matchs")
    private int idMatchs;
    @Column(name = "EtatCourt")
    private String etatCourt;
    @Column(name = "Version")
    private Integer version;

    public Court() {
    }

    public Court(Integer idCourt) {
        this.idCourt = idCourt;
    }

    public Court(Integer idCourt, String nom, int numero, int idMatchs) {
        this.idCourt = idCourt;
        this.nom = nom;
        this.numero = numero;
        this.idMatchs = idMatchs;
    }

    public Integer getIdCourt() {
        return idCourt;
    }

    public void setIdCourt(Integer idCourt) {
        this.idCourt = idCourt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdMatchs() {
        return idMatchs;
    }

    public void setIdMatchs(int idMatchs) {
        this.idMatchs = idMatchs;
    }

    public String getEtatCourt() {
        return etatCourt;
    }

    public void setEtatCourt(String etatCourt) {
        this.etatCourt = etatCourt;
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
        hash += (idCourt != null ? idCourt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Court)) {
            return false;
        }
        Court other = (Court) object;
        if ((this.idCourt == null && other.idCourt != null) || (this.idCourt != null && !this.idCourt.equals(other.idCourt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entites.Court[ idCourt=" + idCourt + " ]";
    }
    
}
