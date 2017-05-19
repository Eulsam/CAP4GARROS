/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entites;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author etudiant
 */
@Entity
@Table(name = "matchs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matchs.findAll", query = "SELECT m FROM Matchs m"),
    @NamedQuery(name = "Matchs.findByIdMatch", query = "SELECT m FROM Matchs m WHERE m.idMatch = :idMatch"),
    @NamedQuery(name = "Matchs.findByEquipe1", query = "SELECT m FROM Matchs m WHERE m.equipe1 = :equipe1"),
    @NamedQuery(name = "Matchs.findByEquipe2", query = "SELECT m FROM Matchs m WHERE m.equipe2 = :equipe2"),
    @NamedQuery(name = "Matchs.findByNomArbitre", query = "SELECT m FROM Matchs m WHERE m.nomArbitre = :nomArbitre"),
    @NamedQuery(name = "Matchs.findByPrenomArbitre", query = "SELECT m FROM Matchs m WHERE m.prenomArbitre = :prenomArbitre"),
    @NamedQuery(name = "Matchs.findByCourt", query = "SELECT m FROM Matchs m WHERE m.court = :court"),
    @NamedQuery(name = "Matchs.findByCalendrier", query = "SELECT m FROM Matchs m WHERE m.calendrier = :calendrier"),
    @NamedQuery(name = "Matchs.findByHeureDebut", query = "SELECT m FROM Matchs m WHERE m.heureDebut = :heureDebut"),
    @NamedQuery(name = "Matchs.findByHeureFin", query = "SELECT m FROM Matchs m WHERE m.heureFin = :heureFin"),
    @NamedQuery(name = "Matchs.findByDuree", query = "SELECT m FROM Matchs m WHERE m.duree = :duree"),
    @NamedQuery(name = "Matchs.findByResultatEquipe1", query = "SELECT m FROM Matchs m WHERE m.resultatEquipe1 = :resultatEquipe1"),
    @NamedQuery(name = "Matchs.findByResultatEquipe2", query = "SELECT m FROM Matchs m WHERE m.resultatEquipe2 = :resultatEquipe2"),
    @NamedQuery(name = "Matchs.findByVersion", query = "SELECT m FROM Matchs m WHERE m.version = :version")})
public class Matchs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdMatch")
    private Integer idMatch;
    @Column(name = "Equipe1")
    private String equipe1;
    @Column(name = "Equipe2")
    private String equipe2;
    @Column(name = "NomArbitre")
    private String nomArbitre;
    @Column(name = "PrenomArbitre")
    private String prenomArbitre;
    @Column(name = "Court")
    private String court;
    @Column(name = "Calendrier")
    @Temporal(TemporalType.DATE)
    private Date calendrier;
    @Column(name = "HeureDebut")
    @Temporal(TemporalType.TIME)
    private Date heureDebut;
    @Column(name = "HeureFin")
    @Temporal(TemporalType.TIME)
    private Date heureFin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Duree")
    private Double duree;
    @Column(name = "ResultatEquipe1")
    private String resultatEquipe1;
    @Column(name = "ResultatEquipe2")
    private String resultatEquipe2;
    @Column(name = "Version")
    @Version
    private Integer version;

    public Matchs() {
    }

    public Matchs(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public String getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(String equipe1) {
        this.equipe1 = equipe1;
    }

    public String getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(String equipe2) {
        this.equipe2 = equipe2;
    }

    public String getNomArbitre() {
        return nomArbitre;
    }

    public void setNomArbitre(String nomArbitre) {
        this.nomArbitre = nomArbitre;
    }

    public String getPrenomArbitre() {
        return prenomArbitre;
    }

    public void setPrenomArbitre(String prenomArbitre) {
        this.prenomArbitre = prenomArbitre;
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    public Date getCalendrier() {
        return calendrier;
    }

    public void setCalendrier(Date calendrier) {
        this.calendrier = calendrier;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public Double getDuree() {
        return duree;
    }

    public void setDuree(Double duree) {
        this.duree = duree;
    }

    public String getResultatEquipe1() {
        return resultatEquipe1;
    }

    public void setResultatEquipe1(String resultatEquipe1) {
        this.resultatEquipe1 = resultatEquipe1;
    }

    public String getResultatEquipe2() {
        return resultatEquipe2;
    }

    public void setResultatEquipe2(String resultatEquipe2) {
        this.resultatEquipe2 = resultatEquipe2;
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
        hash += (idMatch != null ? idMatch.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matchs)) {
            return false;
        }
        Matchs other = (Matchs) object;
        if ((this.idMatch == null && other.idMatch != null) || (this.idMatch != null && !this.idMatch.equals(other.idMatch))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matchs{" + "idMatch=" + idMatch + ", equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", nomArbitre=" + nomArbitre + ", prenomArbitre=" + prenomArbitre + ", court=" + court + ", calendrier=" + calendrier + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", duree=" + duree + ", resultatEquipe1=" + resultatEquipe1 + ", resultatEquipe2=" + resultatEquipe2 +'}';
    }


    
}
