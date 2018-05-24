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
    @NamedQuery(name = "BearingsIndustrialCountry.findByCountry", query = "SELECT l FROM BearingsIndustrialCountry l WHERE l.country = :country"),
 //   @NamedQuery(name = "BearingsIndustrialCountry.findByCountryRu", query = "SELECT l FROM BearingsIndustrialCountry l WHERE l.countryRu = :countryRu"),
    @NamedQuery(name = "BearingsIndustrialCountry.findByNum", query = "SELECT l FROM BearingsIndustrialCountry l WHERE l.num = :num")})
public class BearingsIndustrialCountry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "country")
    private String country;
/*    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "country_ru")
    private String countryRu; */
    @Column(name = "num")
    private Integer num;

    public BearingsIndustrialCountry() {
    }

    public BearingsIndustrialCountry(String countryEn) {
        this.country = countryEn;
   //     this.countryRu = countryRu;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String countryEn) {
        this.country = countryEn;
    }
    
/*    public String getCountryRu() {
        return countryRu;
    }

    public void setCountryRu(String countryRu) {
        this.countryRu = countryRu;
    }
*/
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (country != null ? country.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BearingsIndustrialCountry)) {
            return false;
        }
        BearingsIndustrialCountry other = (BearingsIndustrialCountry) object;
        if ((this.country == null && other.country != null) || (this.country != null && !this.country.equals(other.country))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.bearings.domain.BearingsIndustrialCountry[ country=" + country + " ]";
    }
    
}
