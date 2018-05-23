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
@Table(name="bearings_industrial_country", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BearingsIndustrialCountry.findAll", query = "SELECT l FROM BearingsIndustrialCountry l"),
    @NamedQuery(name = "BearingsIndustrialCountry.findByCountryEn", query = "SELECT l FROM BearingsIndustrialCountry l WHERE l.countryEn = :countryEn"),
    @NamedQuery(name = "BearingsIndustrialCountry.findByCountryRu", query = "SELECT l FROM BearingsIndustrialCountry l WHERE l.countryRu = :countryRu"),
    @NamedQuery(name = "BearingsIndustrialCountry.findByNum", query = "SELECT l FROM BearingsIndustrialCountry l WHERE l.num = :num")})
public class BearingsIndustrialCountry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "country_en")
    private String countryEn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "country_ru")
    private String countryRu;
    @Column(name = "num")
    private Integer num;

    public BearingsIndustrialCountry() {
    }

    public BearingsIndustrialCountry(String countryEn, String countryRu) {
        this.countryEn = countryEn;
        this.countryRu = countryRu;
    }

    public String getCountryEn() {
        return countryEn;
    }

    public void setCountryEn(String countryEn) {
        this.countryEn = countryEn;
    }
    
    public String getCountryRu() {
        return countryRu;
    }

    public void setCountryRu(String countryRu) {
        this.countryRu = countryRu;
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
        hash += (countryEn != null ? countryEn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BearingsIndustrialCountry)) {
            return false;
        }
        BearingsIndustrialCountry other = (BearingsIndustrialCountry) object;
        if ((this.countryEn == null && other.countryEn != null) || (this.countryEn != null && !this.countryEn.equals(other.countryEn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.bearings.domain.BearingsIndustrialCountry[ country=" + countryEn + " ]";
    }
    
}
