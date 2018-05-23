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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name="bearings_industrial_size", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BearingsIndustrialInnerDiameter.findAll", query = "SELECT l FROM BearingsIndustrialSize l"),
    @NamedQuery(name = "BearingsIndustrialInnerDiameter.findByInnerDiameter", query = "SELECT l FROM BearingsIndustrialInnerDiameter l WHERE l.d = :d"),
    @NamedQuery(name = "BearingsIndustrialInnerDiameter.findByNum", query = "SELECT l FROM BearingsIndustrialSize l WHERE l.num = :num")})
public class BearingsIndustrialInnerDiameter implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "d")
    private Integer d;
    
    @Column(name = "num")
    private Integer num;

    public BearingsIndustrialInnerDiameter() {
    }

    public BearingsIndustrialInnerDiameter(Integer d) {
        this.d = d;
    }

    public Integer getInnerDiameter() {
        return d;
    }

    public void setInnerDiameter(Integer d) {
        this.d = d;
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
        hash += (d != null ? d.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BearingsIndustrialInnerDiameter)) {
            return false;
        }
        BearingsIndustrialInnerDiameter other = (BearingsIndustrialInnerDiameter) object;
        if ((this.d == null && other.d != null) || (this.d != null && !this.d.equals(other.d))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.bearings.domain.BearingsIndustrialInnerDiameter[ inner diameter=" + d + " ]";
    }
    
}
