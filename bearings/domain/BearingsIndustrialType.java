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
@Table(name="bearings_industrial_type", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BearingsIndustrialType.findAll", query = "SELECT l FROM BearingsIndustrialType l"),
    @NamedQuery(name = "BearingsIndustrialType.findByType", query = "SELECT l FROM BearingsIndustrialType l WHERE l.type = :type"),
    @NamedQuery(name = "BearingsIndustrialType.findByNum", query = "SELECT l FROM BearingsIndustrialType l WHERE l.num = :num")})
public class BearingsIndustrialType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "type")
    private String type;
    @Column(name = "num")
    private Integer num;

    public BearingsIndustrialType() {
    }

    public BearingsIndustrialType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        hash += (type != null ? type.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BearingsIndustrialType)) {
            return false;
        }
        BearingsIndustrialType other = (BearingsIndustrialType) object;
        if ((this.type == null && other.type != null) || (this.type != null && !this.type.equals(other.type))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.bearings.domain.BearingsIndustrialType[ type=" + type + " ]";
    }
    
}
