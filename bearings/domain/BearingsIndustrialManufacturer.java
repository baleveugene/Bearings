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
@Table(name="bearings_industrial_manufacturer", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BearingsIndustrialManufacturer.findAll", query = "SELECT l FROM BearingsIndustrialManufacturer l"),
    @NamedQuery(name = "BearingsIndustrialManufacturer.findByManufacturer", query = "SELECT l FROM BearingsIndustrialManufacturer l WHERE l.manufacturer = :manufacturer"),
 //   @NamedQuery(name = "BearingsIndustrialManufacturer.findByManufacturerRu", query = "SELECT l FROM BearingsIndustrialManufacturer l WHERE l.manufacturerRu = :manufacturerRu"),
    @NamedQuery(name = "BearingsIndustrialManufacturer.findByNum", query = "SELECT l FROM BearingsIndustrialType l WHERE l.num = :num")})
public class BearingsIndustrialManufacturer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "manufacturer")
    private String manufacturer;
/*    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "manufacturer")
    private String manufacturerRu; */
    @Column(name = "num")
    private Integer num;

    public BearingsIndustrialManufacturer() {
    }

    public BearingsIndustrialManufacturer(String manufacturerEn) {
        this.manufacturer = manufacturerEn;
  //      this.manufacturerRu = manufacturerRu;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturerEn) {
        this.manufacturer = manufacturerEn;
    }
    
/*    public String getManufacturerRu() {
        return manufacturerRu;
    }

    public void setManufacturerRu(String manufacturerRu) {
        this.manufacturerRu = manufacturerRu;
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
        hash += (manufacturer != null ? manufacturer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BearingsIndustrialManufacturer)) {
            return false;
        }
        BearingsIndustrialManufacturer other = (BearingsIndustrialManufacturer) object;
        if ((this.manufacturer == null && other.manufacturer != null) || (this.manufacturer != null && !this.manufacturer.equals(other.manufacturer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.bearings.domain.BearingsIndustrialManufacturer[ manufacturer=" + manufacturer + " ]";
    }
    
}
