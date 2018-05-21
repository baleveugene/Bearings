/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.domain.manufacturer;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name="manufacturer", schema = "", catalog = "qjvmhoia_hmc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manufacturer.findAll", query = "SELECT m FROM Manufacturer m"),
    @NamedQuery(name = "Manufacturer.findById", query = "SELECT m FROM Manufacturer m WHERE m.id = :id"),
    @NamedQuery(name = "Manufacturer.findByBrand", query = "SELECT m FROM Manufacturer m WHERE m.brand = :brand"),
    @NamedQuery(name = "Manufacturer.findByCountry", query = "SELECT m FROM Manufacturer m WHERE m.country = :country"),
    @NamedQuery(name = "Manufacturer.findByLogo", query = "SELECT m FROM Manufacturer m WHERE m.logo = :logo"),
    @NamedQuery(name = "Manufacturer.findByPhoto1", query = "SELECT m FROM Manufacturer m WHERE m.photo1 = :photo1"),
    @NamedQuery(name = "Manufacturer.findByPhoto2", query = "SELECT m FROM Manufacturer m WHERE m.photo2 = :photo2"),
    @NamedQuery(name = "Manufacturer.findByPhoto3", query = "SELECT m FROM Manufacturer m WHERE m.photo3 = :photo3"),
    @NamedQuery(name = "Manufacturer.findByVideo1", query = "SELECT m FROM Manufacturer m WHERE m.video1 = :video1"),
    @NamedQuery(name = "Manufacturer.findByVideo2", query = "SELECT m FROM Manufacturer m WHERE m.video2 = :video2"),
    @NamedQuery(name = "Manufacturer.findByVideo3", query = "SELECT m FROM Manufacturer m WHERE m.video3 = :video3")})
public class Manufacturer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "brand")
    private String brand;
    @Size(max = 245)
    @Column(name = "country")
    private String country;
    @Size(max = 145)
    @Column(name = "logo")
    private String logo;
    @Size(max = 145)
    @Column(name = "photo1")
    private String photo1;
    @Size(max = 145)
    @Column(name = "photo2")
    private String photo2;
    @Size(max = 145)
    @Column(name = "photo3")
    private String photo3;
    @Lob
    @Size(max = 65535)
    @Column(name = "description1")
    private String description1;
    @Lob
    @Size(max = 65535)
    @Column(name = "description2")
    private String description2;
    @Lob
    @Size(max = 65535)
    @Column(name = "description3")
    private String description3;
    @Size(max = 245)
    @Column(name = "video1")
    private String video1;
    @Size(max = 245)
    @Column(name = "video2")
    private String video2;
    @Size(max = 245)
    @Column(name = "video3")
    private String video3;

    public Manufacturer() {
    }

    public Manufacturer(String brand) {
        this.brand = brand;
    }

    public Manufacturer(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getVideo1() {
        return video1;
    }

    public void setVideo1(String video1) {
        this.video1 = video1;
    }

    public String getVideo2() {
        return video2;
    }

    public void setVideo2(String video2) {
        this.video2 = video2;
    }

    public String getVideo3() {
        return video3;
    }

    public void setVideo3(String video3) {
        this.video3 = video3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brand != null ? brand.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manufacturer)) {
            return false;
        }
        Manufacturer other = (Manufacturer) object;
        if ((this.brand == null && other.brand != null) || (this.brand != null && !this.brand.equals(other.brand))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.mvc.domain.manufacturer.Manufacturer[ brand=" + brand + " ]";
    }
    
}
