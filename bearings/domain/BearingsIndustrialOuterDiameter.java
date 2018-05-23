/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.bearings.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name="bearings_industrial_outer_diameter", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BearingsIndustrialOuterDiameter.findAll", query = "SELECT l FROM BearingsIndustrialOuterDiameter l"),
    @NamedQuery(name = "BearingsIndustrialOuterDiameter.findByOuterDiameter", query = "SELECT l FROM BearingsIndustrialOuterDiameter l WHERE l.D = :D"),
    @NamedQuery(name = "BearingsIndustrialOuterDiameter.findByNum", query = "SELECT l FROM BearingsIndustrialOuterDiameter l WHERE l.num = :num")})
public class BearingsIndustrialOuterDiameter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "D")
    private Integer D;
    @Column(name = "num")
    private Integer num;

    public BearingsIndustrialOuterDiameter() {
    }

    public BearingsIndustrialOuterDiameter(Integer D) {
        this.D = D;
    }

    public Integer getOuterDiameter() {
        return D;
    }

    public void setOuterDiameter(Integer D) {
        this.D = D;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (D != null ? D.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BearingsIndustrialOuterDiameter)) {
            return false;
        }
        BearingsIndustrialOuterDiameter other = (BearingsIndustrialOuterDiameter) object;
        if ((this.D == null && other.D != null) || (this.D != null && !this.D.equals(other.D))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.bearings.domain.BearingsIndustrialOuterDiameter[ outer diameter=" + D + " ]";
    }
    
}
