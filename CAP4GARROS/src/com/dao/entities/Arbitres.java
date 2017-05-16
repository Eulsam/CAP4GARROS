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
@Table(name = "arbitres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arbitres.findAll", query = "SELECT a FROM Arbitres a"),
    @NamedQuery(name = "Arbitres.findByIdArbitre", query = "SELECT a FROM Arbitres a WHERE a.idArbitre = :idArbitre"),
    @NamedQuery(name = "Arbitres.findByNom", query = "SELECT a FROM Arbitres a WHERE a.nom = :nom"),
    @NamedQuery(name = "Arbitres.findByPrenom", query = "SELECT a FROM Arbitres a WHERE a.prenom = :prenom"),
    @NamedQuery(name = "Arbitres.findByNation", query = "SELECT a FROM Arbitres a WHERE a.nation = :nation"),
    @NamedQuery(name = "Arbitres.findByNiveau", query = "SELECT a FROM Arbitres a WHERE a.niveau = :niveau"),
    @NamedQuery(name = "Arbitres.findByVersion", query = "SELECT a FROM Arbitres a WHERE a.version = :version")})
public class Arbitres implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdArbitre")
    private Integer idArbitre;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "Nation")
    private String nation;
    @Column(name = "Niveau")
    private String niveau;
    @Column(name = "Version")
    @Version
    private Integer version;

    public Arbitres() {
    }

    public Arbitres(Integer idArbitre) {
        this.idArbitre = idArbitre;
    }

    public Integer getIdArbitre() {
        return idArbitre;
    }

    public void setIdArbitre(Integer idArbitre) {
        this.idArbitre = idArbitre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
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
        hash += (idArbitre != null ? idArbitre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arbitres)) {
            return false;
        }
        Arbitres other = (Arbitres) object;
        if ((this.idArbitre == null && other.idArbitre != null) || (this.idArbitre != null && !this.idArbitre.equals(other.idArbitre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dao.entities.Arbitres[ idArbitre=" + idArbitre + " ]";
    }
    
}
