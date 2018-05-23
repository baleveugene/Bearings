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
@Table(name="bearings_industrial_width", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BearingsIndustrialWidth.findAll", query = "SELECT l FROM BearingsIndustrialWidth l"),
    @NamedQuery(name = "BearingsIndustrialWidth.findByWidth", query = "SELECT l FROM BearingsIndustrialWidth l WHERE l.B = :B"),
    @NamedQuery(name = "BearingsIndustrialWidth.findByNum", query = "SELECT l FROM BearingsIndustrialWidth l WHERE l.num = :num")})
public class BearingsIndustrialWidth implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "width")
    private Integer B;
    @Column(name = "num")
    private Integer num;

    public BearingsIndustrialWidth() {
    }

    public BearingsIndustrialWidth(Integer B) {
        this.B = B;
    }

    public Integer getWidth() {
        return B;
    }

    public void setWidth(Integer B) {
        this.B = B;
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
        hash += (B != null ? B.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BearingsIndustrialWidth)) {
            return false;
        }
        BearingsIndustrialWidth other = (BearingsIndustrialWidth) object;
        if ((this.B == null && other.B != null) || (this.B != null && !this.B.equals(other.B))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.bearings.domain.BearingsIndustrialWidth[ width=" + B + " ]";
    }
    
}
