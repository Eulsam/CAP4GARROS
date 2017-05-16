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
 * @author Phuong
 */
@Entity
@Table(name = "courts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Courts.findAll", query = "SELECT c FROM Courts c"),
    @NamedQuery(name = "Courts.findByIdCourt", query = "SELECT c FROM Courts c WHERE c.idCourt = :idCourt"),
    @NamedQuery(name = "Courts.findByNom", query = "SELECT c FROM Courts c WHERE c.nom = :nom"),
    @NamedQuery(name = "Courts.findByNumero", query = "SELECT c FROM Courts c WHERE c.numero = :numero"),
    @NamedQuery(name = "Courts.findByEtatCourt", query = "SELECT c FROM Courts c WHERE c.etatCourt = :etatCourt"),
    @NamedQuery(name = "Courts.findByVersion", query = "SELECT c FROM Courts c WHERE c.version = :version")})
public class Courts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdCourt")
    private Integer idCourt;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Numero")
    private Integer numero;
    @Column(name = "EtatCourt")
    private String etatCourt;  
    @Column(name = "Version")
    @Version
    private Integer version;

    public Courts() {
    }

    public Courts(Integer idCourt) {
        this.idCourt = idCourt;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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
        if (!(object instanceof Courts)) {
            return false;
        }
        Courts other = (Courts) object;
        if ((this.idCourt == null && other.idCourt != null) || (this.idCourt != null && !this.idCourt.equals(other.idCourt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("[idCourt=%s, nom=%s, numero=%s, etatCourt=%s, version=%s]", idCourt, nom, numero, etatCourt, version);
    }
    
}
