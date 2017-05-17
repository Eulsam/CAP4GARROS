/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entites;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author etudiant
 */
@Entity
@Table(name = "participer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Participer.findAll", query = "SELECT p FROM Participer p"),
    @NamedQuery(name = "Participer.findByIdParticiper", query = "SELECT p FROM Participer p WHERE p.participerPK.idParticiper = :idParticiper"),
    @NamedQuery(name = "Participer.findByIdMatchs", query = "SELECT p FROM Participer p WHERE p.participerPK.idMatchs = :idMatchs"),
    @NamedQuery(name = "Participer.findByVersion", query = "SELECT p FROM Participer p WHERE p.version = :version")})
public class Participer implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParticiperPK participerPK;
    @Column(name = "Version")
    private Integer version;
    @JoinColumn(name = "idParticiper", referencedColumnName = "idPersonne", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personne personne;

    public Participer() {
    }

    public Participer(ParticiperPK participerPK) {
        this.participerPK = participerPK;
    }

    public Participer(int idParticiper, int idMatchs) {
        this.participerPK = new ParticiperPK(idParticiper, idMatchs);
    }

    public ParticiperPK getParticiperPK() {
        return participerPK;
    }

    public void setParticiperPK(ParticiperPK participerPK) {
        this.participerPK = participerPK;
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
        hash += (participerPK != null ? participerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Participer)) {
            return false;
        }
        Participer other = (Participer) object;
        if ((this.participerPK == null && other.participerPK != null) || (this.participerPK != null && !this.participerPK.equals(other.participerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entites.Participer[ participerPK=" + participerPK + " ]";
    }
    
}
