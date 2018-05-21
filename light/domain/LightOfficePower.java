/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.light.domain;

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


 ////     @Table(name="light_office", schema = "", catalog = "qjvmhoia_hmc")

////     "light/office/" +   


@Entity
@Table(name="light_office_power", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LightOfficePower.findAll", query = "SELECT l FROM LightOfficePower l"),
    @NamedQuery(name = "LightOfficePower.findByPower", query = "SELECT l FROM LightOfficePower l WHERE l.power = :power"),
    @NamedQuery(name = "LightOfficePower.findByNum", query = "SELECT l FROM LightOfficePower l WHERE l.num = :num")})
public class LightOfficePower implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "power")
    private Integer power;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num")
    private int num;

    public LightOfficePower() {
    }

    public LightOfficePower(Integer power) {
        this.power = power;
    }

    public LightOfficePower(Integer power, int num) {
        this.power = power;
        this.num = num;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (power != null ? power.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LightOfficePower)) {
            return false;
        }
        LightOfficePower other = (LightOfficePower) object;
        if ((this.power == null && other.power != null) || (this.power != null && !this.power.equals(other.power))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.light.domain.LightOfficePower[ power=" + power + " ]";
    }
    
}
