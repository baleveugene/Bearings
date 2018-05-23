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
@Table(name="bearings_industrial_subtype", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BearingsIndustrialSubType.findAll", query = "SELECT l FROM BearingsIndustrialSubType l"),
    @NamedQuery(name = "BearingsIndustrialSubType.findBySubType", query = "SELECT l FROM BearingsIndustrialSubType l WHERE l.subType = :subType"),
    @NamedQuery(name = "BearingsIndustrialSubType.findByNum", query = "SELECT l FROM BearingsIndustrialSubType l WHERE l.num = :num")})
public class BearingsIndustrialSubType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "subtype")
    private String subType;
    @Column(name = "num")
    private Integer num;

    public BearingsIndustrialSubType() {
    }

    public BearingsIndustrialSubType(String subType) {
        this.subType = subType;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
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
        hash += (subType != null ? subType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BearingsIndustrialSubType)) {
            return false;
        }
        BearingsIndustrialSubType other = (BearingsIndustrialSubType) object;
        if ((this.subType == null && other.subType != null) || (this.subType != null && !this.subType.equals(other.subType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.bearings.domain.BearingsIndustrialSubType[ subType=" + subType + " ]";
    }
    
}
