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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="bearings_industrial", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BearingsIndustrial.findAll", query = "SELECT l FROM BearingsIndustrial l"),
    @NamedQuery(name = "BearingsIndustrial.findById", query = "SELECT l FROM BearingsIndustrial l WHERE l.id = :id"),
    @NamedQuery(name = "BearingsIndustrial.findByUrl", query = "SELECT l FROM BearingsIndustrial l WHERE l.url = :url"),
    @NamedQuery(name = "BearingsIndustrial.findByType", query = "SELECT l FROM BearingsIndustrial l WHERE l.type = :type"),
    @NamedQuery(name = "BearingsIndustrial.findBySubType", query = "SELECT l FROM BearingsIndustrial l WHERE l.subType = :subType"),
    @NamedQuery(name = "BearingsIndustrial.findByModel", query = "SELECT l FROM BearingsIndustrial l WHERE l.model = :model"),
    @NamedQuery(name = "BearingsIndustrial.findByManufacturer", query = "SELECT l FROM BearingsIndustrial l WHERE l.manufacturer = :manufacturer"),
    @NamedQuery(name = "BearingsIndustrial.findByCountry", query = "SELECT l FROM BearingsIndustrial l WHERE l.country = :country"),
    @NamedQuery(name = "BearingsIndustrial.findByBasicDynamicLoadRating", query = "SELECT l FROM BearingsIndustrial l WHERE l.basicDynamicLoadRating = :basicDynamicLoadRating"),
    @NamedQuery(name = "BearingsIndustrial.findByBasicStaticLoadRating", query = "SELECT l FROM BearingsIndustrial l WHERE l.basicStaticLoadRating = :basicStaticLoadRating"),
    @NamedQuery(name = "BearingsIndustrial.findByFatiqueLoadLimit", query = "SELECT l FROM BearingsIndustrial l WHERE l.fatiqueLoadLimit = :fatiqueLoadLimit"),
    @NamedQuery(name = "BearingsIndustrial.findByReferenceSpeed", query = "SELECT l FROM BearingsIndustrial l WHERE l.referenceSpeed = :referenceSpeed"),
    @NamedQuery(name = "BearingsIndustrial.findByLimitingSpeed", query = "SELECT l FROM BearingsIndustrial l WHERE l.limitingSpeed = :limitingSpeed"),
    @NamedQuery(name = "BearingsIndustrial.findBySize", query = "SELECT l FROM BearingsIndustrial l WHERE l.size = :size"),
    @NamedQuery(name = "BearingsIndustrial.findByWeight", query = "SELECT l FROM BearingsIndustrial l WHERE l.weight = :weight"),
    @NamedQuery(name = "BearingsIndustrial.findByTemperatureWork", query = "SELECT l FROM BearingsIndustrial l WHERE l.temperatureWork = :temperatureWork"),
    @NamedQuery(name = "BearingsIndustrial.findByGuarantee", query = "SELECT l FROM BearingsIndustrial l WHERE l.guarantee = :guarantee"),
    @NamedQuery(name = "BearingsIndustrial.findByPrice", query = "SELECT l FROM BearingsIndustrial l WHERE l.price = :price"),
    @NamedQuery(name = "BearingsIndustrial.findByPhoto1", query = "SELECT l FROM BearingsIndustrial l WHERE l.photo1 = :photo1"),
    @NamedQuery(name = "BearingsIndustrial.findByPhoto2", query = "SELECT l FROM BearingsIndustrial l WHERE l.photo2 = :photo2"),
    @NamedQuery(name = "BearingsIndustrial.findByPhoto3", query = "SELECT l FROM BearingsIndustrial l WHERE l.photo3 = :photo3"),
    @NamedQuery(name = "BearingsIndustrial.findByVideo1", query = "SELECT l FROM BearingsIndustrial l WHERE l.video1 = :video1")})
public class BearingsIndustrial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "id")
    private String id;
    @Size(max = 255)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "subType")
    private String subType;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "manufacturer")
    private String manufacturer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @NotNull
    @Column(name = "basic_dynamic_load_rating")
    private int basicDynamicLoadRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "basic_static_load_rating")
    private int basicStaticLoadRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fatique_load_limit")
    private int fatiqueLoadLimit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reference_speed")
    private int referenceSpeed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "limiting_speed")
    private int limitingSpeed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "size")
    private String size;   
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "weight")
    private String weight;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "temperature_work")
    private String temperatureWork;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "guarantee")
    private String guarantee;  
    @Column(name = "price")
    private Integer price;
    @Size(max = 245)
    @Column(name = "photo1")
    private String photo1;
    @Size(max = 245)
    @Column(name = "photo2")
    private String photo2;
    @Size(max = 245)
    @Column(name = "photo3")
    private String photo3;
    @Size(max = 245)
    @Column(name = "photo4")
    private String photo4;
    @Size(max = 245)
    @Column(name = "photo5")
    private String photo5;
    @Lob
    @Size(max = 65535)
    @Column(name = "description_en")
    private String descriptionEn;
    @Size(max = 255)
    @Column(name = "video1")
    private String video1;

    public BearingsIndustrial() {
    }

    public BearingsIndustrial(String model) {
        this.model = model;
    }

    public BearingsIndustrial(String model, String type, String subType, 
            String manufacturer, String country, int basicDynamicLoadRating, 
            int basicStaticLoadRating, int fatiqueLoadLimit, int referenceSpeed, 
            int limitingSpeed, String size, String weight, String temperatureWork, String guarantee) {
        this.model = model;
        this.type = type;
        this.subType = subType;
        this.manufacturer = manufacturer;
        this.country = country;
        this.basicDynamicLoadRating = basicDynamicLoadRating;
        this.basicStaticLoadRating = basicStaticLoadRating;
        this.fatiqueLoadLimit = fatiqueLoadLimit;
        this.referenceSpeed = referenceSpeed;
        this.limitingSpeed = limitingSpeed;
        this.size = size;
        this.weight = weight;
        this.temperatureWork = temperatureWork;
        this.guarantee = guarantee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
     public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBasicDynamicLoadRating() {
        return basicDynamicLoadRating;
    }

    public void setBasicDynamicLoadRating(int basicDynamicLoadRating) {
        this.basicDynamicLoadRating = basicDynamicLoadRating;
    }

    public int getBasicStaticLoadRating() {
        return basicStaticLoadRating;
    }

    public void setBasicStaticLoadRating(int basicStaticLoadRating) {
        this.basicStaticLoadRating = basicStaticLoadRating;
    }

    public int getFatiqueLoadLimit() {
        return fatiqueLoadLimit;
    }

    public void setFatiqueLoadLimit(int fatiqueLoadLimit) {
        this.fatiqueLoadLimit = fatiqueLoadLimit;
    }

    public int getReferenceSpeed() {
        return referenceSpeed;
    }

    public void setReferenceSpeed(int referenceSpeed) {
        this.referenceSpeed = referenceSpeed;
    }

    public int getLimitingSpeed() {
        return limitingSpeed;
    }

    public void setLimitingSpeed(int limitingSpeed) {
        this.limitingSpeed = limitingSpeed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTemperatureWork() {
        return temperatureWork;
    }

    public void setTemperatureWork(String temperatureWork) {
        this.temperatureWork = temperatureWork;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPhoto1() {
        return "bearings/industrial/" +   photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return "bearings/industrial/" +   photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return "bearings/industrial/" +   photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3; 
    }
    
     public String getPhoto4() {
        return "bearings/industrial/" +  photo4;
    }

    public void setPhoto4(String photo4) {
        this.photo4 = photo4;
    }

    public String getPhoto5() {
        return "bearings/industrial/" +  photo5;
    }

    public void setPhoto5(String photo5) {
        this.photo5 = photo5;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getVideo1() {
        return video1;
    }

    public void setVideo1(String video1) {
        this.video1 = video1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (model != null ? model.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BearingsIndustrial)) {
            return false;
        }
        BearingsIndustrial other = (BearingsIndustrial) object;
        if ((this.model == null && other.model != null) || (this.model != null && !this.model.equals(other.model))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.bearings.domain.BearingsIndustrial[ model=" + model + " ]";
    }
}
