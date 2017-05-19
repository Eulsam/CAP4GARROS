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
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author etudiant
 */
@Entity
@Table(name = "arbitre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arbitre.findAll", query = "SELECT a FROM Arbitre a"),
    @NamedQuery(name = "Arbitre.findByIdArbitre", query = "SELECT a FROM Arbitre a WHERE a.idArbitre = :idArbitre"),
    @NamedQuery(name = "Arbitre.findByIdMatchs", query = "SELECT a FROM Arbitre a WHERE a.idMatchs = :idMatchs"),
    @NamedQuery(name = "Arbitre.findByVersion", query = "SELECT a FROM Arbitre a WHERE a.version = :version")})
public class Arbitre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idArbitre")
    private Integer idArbitre;
    @Basic(optional = false)
    @Column(name = "id_Matchs")
    private int idMatchs;
    @Column(name = "Version")
    @Version
    private Integer version;
    @JoinColumn(name = "idArbitre", referencedColumnName = "idPersonne", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Personne personne;

    public Arbitre() {
    }

    public Arbitre(Integer idArbitre) {
        this.idArbitre = idArbitre;
    }

    public Arbitre(Integer idArbitre, int idMatchs) {
        this.idArbitre = idArbitre;
        this.idMatchs = idMatchs;
    }

    public Integer getIdArbitre() {
        return idArbitre;
    }

    public void setIdArbitre(Integer idArbitre) {
        this.idArbitre = idArbitre;
    }

    public int getIdMatchs() {
        return idMatchs;
    }

    public void setIdMatchs(int idMatchs) {
        this.idMatchs = idMatchs;
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
        hash += (idArbitre != null ? idArbitre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arbitre)) {
            return false;
        }
        Arbitre other = (Arbitre) object;
        if ((this.idArbitre == null && other.idArbitre != null) || (this.idArbitre != null && !this.idArbitre.equals(other.idArbitre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Arbitre{" + "idArbitre=" + idArbitre + ", idMatchs=" + idMatchs + ", personne=" + personne + '}';
    }


    
}
