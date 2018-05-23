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
    @NamedQuery(name = "BearingsIndustrial.findByTypeEn", query = "SELECT l FROM BearingsIndustrial l WHERE l.type_en = :type_en"),
    @NamedQuery(name = "BearingsIndustrial.findByTypeRu", query = "SELECT l FROM BearingsIndustrial l WHERE l.type_ru = :type_ru"),
    @NamedQuery(name = "BearingsIndustrial.findBySubTypeEn", query = "SELECT l FROM BearingsIndustrial l WHERE l.subType_en = :subType_en"),
    @NamedQuery(name = "BearingsIndustrial.findBySubTypeRu", query = "SELECT l FROM BearingsIndustrial l WHERE l.subType_ru = :subType_ru"),
    @NamedQuery(name = "BearingsIndustrial.findByModel", query = "SELECT l FROM BearingsIndustrial l WHERE l.model = :model"),
    @NamedQuery(name = "BearingsIndustrial.findByManufacturerEn", query = "SELECT l FROM BearingsIndustrial l WHERE l.manufacturer_en = :manufacturer_en"),
    @NamedQuery(name = "BearingsIndustrial.findByManufacturerRu", query = "SELECT l FROM BearingsIndustrial l WHERE l.manufacturer_ru = :manufacturer_ru"),
    @NamedQuery(name = "BearingsIndustrial.findByCountryEn", query = "SELECT l FROM BearingsIndustrial l WHERE l.country_en = :country_en"),
    @NamedQuery(name = "BearingsIndustrial.findByCountryRu", query = "SELECT l FROM BearingsIndustrial l WHERE l.country_ru = :country_ru"),
    @NamedQuery(name = "BearingsIndustrial.findByBasicDynamicLoadRating", query = "SELECT l FROM BearingsIndustrial l WHERE l.basicDynamicLoadRating = :basicDynamicLoadRating"),
    @NamedQuery(name = "BearingsIndustrial.findByBasicStaticLoadRating", query = "SELECT l FROM BearingsIndustrial l WHERE l.basicStaticLoadRating = :basicStaticLoadRating"),
    @NamedQuery(name = "BearingsIndustrial.findByFatiqueLoadLimit", query = "SELECT l FROM BearingsIndustrial l WHERE l.fatiqueLoadLimit = :fatiqueLoadLimit"),
    @NamedQuery(name = "BearingsIndustrial.findByReferenceSpeed", query = "SELECT l FROM BearingsIndustrial l WHERE l.referenceSpeed = :referenceSpeed"),
    @NamedQuery(name = "BearingsIndustrial.findByLimitingSpeed", query = "SELECT l FROM BearingsIndustrial l WHERE l.limitingSpeed = :limitingSpeed"),
    @NamedQuery(name = "BearingsIndustrial.findByInnerDiameter", query = "SELECT l FROM BearingsIndustrial l WHERE l.d = :d"),
    @NamedQuery(name = "BearingsIndustrial.findByOuterDiameter", query = "SELECT l FROM BearingsIndustrial l WHERE l.D = :D"),
    @NamedQuery(name = "BearingsIndustrial.findByWidth", query = "SELECT l FROM BearingsIndustrial l WHERE l.B = :B"),
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
    @Column(name = "type_en")
    private String type_en;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "type_ru")
    private String type_ru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "subType_en")
    private String subType_en;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "subType_ru")
    private String subType_ru;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "manufacturer_en")
    private String manufacturer_en;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "manufacturer_ru")
    private String manufacturer_ru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "country_en")
    private String country_en;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "country_ru")
    private String country_ru;
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
    @Column(name = "d_inner_diameter")
    private int d;
    @Basic(optional = false)
    @NotNull   
    @Column(name = "D_outer_diameter")
    private int D;
    @Basic(optional = false)
    @NotNull   
    @Column(name = "B_width")
    private int B;
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
    @Lob
    @Size(max = 65535)
    @Column(name = "description_ru")
    private String descriptionRu;
    @Size(max = 255)
    @Column(name = "video1")
    private String video1;

    public BearingsIndustrial() {
    }

    public BearingsIndustrial(String model) {
        this.model = model;
    }

    public BearingsIndustrial(String model, String type_en, String subType_en, 
            String manufacturer_en, String country_en, String type_ru, String subType_ru, 
            String manufacturer_ru, String country_ru, int basicDynamicLoadRating, 
            int basicStaticLoadRating, int fatiqueLoadLimit, int referenceSpeed, 
            int limitingSpeed, int d, int D, int B, String weight, String temperatureWork, 
            String guarantee) {
        this.model = model;
        this.type_en = type_en;
        this.subType_en = subType_en;
        this.manufacturer_en = manufacturer_en;
        this.country_en = country_en;
        this.type_en = type_ru;
        this.subType_en = subType_ru;
        this.manufacturer_en = manufacturer_ru;
        this.country_en = country_ru;
        this.basicDynamicLoadRating = basicDynamicLoadRating;
        this.basicStaticLoadRating = basicStaticLoadRating;
        this.fatiqueLoadLimit = fatiqueLoadLimit;
        this.referenceSpeed = referenceSpeed;
        this.limitingSpeed = limitingSpeed;
        this.d = d;
        this.D = D;
        this.B = B;
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

    public String getType_en() {
        return type_en;
    }

    public void setType_en(String type_en) {
        this.type_en = type_en;
    }
    
     public String getSubType_en() {
        return subType_en;
    }

    public void setSubType_en(String subType_en) {
        this.subType_en = subType_en;
    }
    
    public String getType_ru() {
        return type_ru;
    }

    public void setType_ru(String type_ru) {
        this.type_ru = type_ru;
    }
    
     public String getSubType_ru() {
        return subType_ru;
    }

    public void setSubType_ru(String subType_ru) {
        this.subType_ru = subType_ru;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer_en() {
        return manufacturer_en;
    }

    public void setManufacturer_en(String manufacturer_en) {
        this.manufacturer_en = manufacturer_en;
    }

    public String getCountry_en() {
        return country_en;
    }

    public void setCountry_en(String country_en) {
        this.country_en = country_en;
    }
    
    public String getManufacturer_ru() {
        return manufacturer_en;
    }

    public void setManufacturer_ru(String manufacturer_ru) {
        this.manufacturer_ru = manufacturer_ru;
    }

    public String getCountry_ru() {
        return country_ru;
    }

    public void setCountry_ru(String country_ru) {
        this.country_ru = country_ru;
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

    public int getInnerDiameter() {
        return d;
    }

    public void setInnerDiameter(int d) {
        this.d = d;
    }

    public int getOuterDiameter() {
        return D;
    }

    public void setOuterDiameter(int D) {
        this.D = D;
    }
    
    public int getWidth() {
        return B;
    }

    public void setWidth(int B) {
        this.B = B;
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
    
    public String getDescriptionRu() {
        return descriptionRu;
    }

    public void setDescriptionRu(String descriptionRu) {
        this.descriptionRu = descriptionRu;
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
