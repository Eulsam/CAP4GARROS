/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author etudiant
 */
@Embeddable
public class ParticiperPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idParticiper")
    private int idParticiper;
    @Basic(optional = false)
    @Column(name = "id_Matchs")
    private int idMatchs;

    public ParticiperPK() {
    }

    public ParticiperPK(int idParticiper, int idMatchs) {
        this.idParticiper = idParticiper;
        this.idMatchs = idMatchs;
    }

    public int getIdParticiper() {
        return idParticiper;
    }

    public void setIdParticiper(int idParticiper) {
        this.idParticiper = idParticiper;
    }

    public int getIdMatchs() {
        return idMatchs;
    }

    public void setIdMatchs(int idMatchs) {
        this.idMatchs = idMatchs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idParticiper;
        hash += (int) idMatchs;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParticiperPK)) {
            return false;
        }
        ParticiperPK other = (ParticiperPK) object;
        if (this.idParticiper != other.idParticiper) {
            return false;
        }
        if (this.idMatchs != other.idMatchs) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entites.ParticiperPK[ idParticiper=" + idParticiper + ", idMatchs=" + idMatchs + " ]";
    }
    
}
