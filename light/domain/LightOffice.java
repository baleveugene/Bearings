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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;




//   @Table(name="light_antiexplosion_power", schema = "", catalog = "qjvmhoia_hmc")
//   @Table(name="light_industrial_power", schema = "", catalog = "qjvmhoia_hmc")
//    @Table(name="light_street_power", schema = "", catalog = "qjvmhoia_hmc")

@Entity
@Table(name="light_office", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LightOffice.findAll", query = "SELECT l FROM LightOffice l"),
    @NamedQuery(name = "LightOffice.findById", query = "SELECT l FROM LightOffice l WHERE l.id = :id"),
    @NamedQuery(name = "LightOffice.findByType", query = "SELECT l FROM LightOffice l WHERE l.type = :type"),
    @NamedQuery(name = "LightOffice.findByModel", query = "SELECT l FROM LightOffice l WHERE l.model = :model"),
    @NamedQuery(name = "LightOffice.findByUrl", query = "SELECT l FROM LightOffice l WHERE l.url = :url"),
    @NamedQuery(name = "LightOffice.findByManufacturer", query = "SELECT l FROM LightOffice l WHERE l.manufacturer = :manufacturer"),
    @NamedQuery(name = "LightOffice.findByCountry", query = "SELECT l FROM LightOffice l WHERE l.country = :country"),
    @NamedQuery(name = "LightOffice.findByDiffuser", query = "SELECT l FROM LightOffice l WHERE l.diffuser = :diffuser"),
    @NamedQuery(name = "LightOffice.findByPower", query = "SELECT l FROM LightOffice l WHERE l.power = :power"),
    @NamedQuery(name = "LightOffice.findByLuminousFlux", query = "SELECT l FROM LightOffice l WHERE l.luminousFlux = :luminousFlux"),
    @NamedQuery(name = "LightOffice.findByLuminousFluxEmergency", query = "SELECT l FROM LightOffice l WHERE l.luminousFluxEmergency = :luminousFluxEmergency"),
    @NamedQuery(name = "LightOffice.findByTemperatureGlow", query = "SELECT l FROM LightOffice l WHERE l.temperatureGlow = :temperatureGlow"),
    @NamedQuery(name = "LightOffice.findBySize", query = "SELECT l FROM LightOffice l WHERE l.size = :size"),
    @NamedQuery(name = "LightOffice.findBySizeInstallation", query = "SELECT l FROM LightOffice l WHERE l.sizeInstallation = :sizeInstallation"),
    @NamedQuery(name = "LightOffice.findByCoefficientPulsation", query = "SELECT l FROM LightOffice l WHERE l.coefficientPulsation = :coefficientPulsation"),
    @NamedQuery(name = "LightOffice.findByCoefficientPower", query = "SELECT l FROM LightOffice l WHERE l.coefficientPower = :coefficientPower"),
    @NamedQuery(name = "LightOffice.findByTypeLidc", query = "SELECT l FROM LightOffice l WHERE l.typeLidc = :typeLidc"),
    @NamedQuery(name = "LightOffice.findByIndexColor", query = "SELECT l FROM LightOffice l WHERE l.indexColor = :indexColor"),
    @NamedQuery(name = "LightOffice.findBySecurity", query = "SELECT l FROM LightOffice l WHERE l.security = :security"),
    @NamedQuery(name = "LightOffice.findByWeight", query = "SELECT l FROM LightOffice l WHERE l.weight = :weight"),
    @NamedQuery(name = "LightOffice.findByTemperatureWork", query = "SELECT l FROM LightOffice l WHERE l.temperatureWork = :temperatureWork"),
    @NamedQuery(name = "LightOffice.findByGuarantee", query = "SELECT l FROM LightOffice l WHERE l.guarantee = :guarantee"),
    @NamedQuery(name = "LightOffice.findByDimmingFunction", query = "SELECT l FROM LightOffice l WHERE l.dimmingFunction = :dimmingFunction"),
    @NamedQuery(name = "LightOffice.findByMountingType", query = "SELECT l FROM LightOffice l WHERE l.mountingType = :mountingType"),
    @NamedQuery(name = "LightOffice.findByPrice", query = "SELECT l FROM LightOffice l WHERE l.price = :price"),
    @NamedQuery(name = "LightOffice.findByPhoto1", query = "SELECT l FROM LightOffice l WHERE l.photo1 = :photo1"),
    @NamedQuery(name = "LightOffice.findByPhoto2", query = "SELECT l FROM LightOffice l WHERE l.photo2 = :photo2"),
    @NamedQuery(name = "LightOffice.findByPhoto3", query = "SELECT l FROM LightOffice l WHERE l.photo3 = :photo3"),
    @NamedQuery(name = "LightOffice.findByVideo1", query = "SELECT l FROM LightOffice l WHERE l.video1 = :video1")})
public class LightOffice implements Serializable {

    @Size(max = 245)
    @Column(name = "photo4")
    private String photo4;
    @Size(max = 245)
    @Column(name = "photo5")
    private String photo5;

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "type")
    private String type;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "url")
    private String url;
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
    @Size(min = 1, max = 245)
    @Column(name = "diffuser")
    private String diffuser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "power")
    private String power;
    @Basic(optional = false)
    @NotNull
    @Column(name = "luminous_flux")
    private int luminousFlux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "luminous_flux_emergency")
    private int luminousFluxEmergency;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "temperature_glow")
    private String temperatureGlow;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "size")
    private String size;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "size_installation")
    private String sizeInstallation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "coefficient_pulsation")
    private String coefficientPulsation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "coefficient_power")
    private String coefficientPower;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "type_lidc")
    private String typeLidc;
    @Size(max = 45)
    @Column(name = "index_color")
    private String indexColor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "security")
    private String security;
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
    @Size(max = 45)
    @Column(name = "dimming_function")
    private String dimmingFunction;
    @Size(max = 245)
    @Column(name = "mounting_type")
    private String mountingType;
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
    @Lob
    @Size(max = 65535)
    @Column(name = "description_en")
    private String descriptionEn;
    @Size(max = 255)
    @Column(name = "video1")
    private String video1;

    public LightOffice() {
    }

    public LightOffice(String model) {
        this.model = model;
    }

    public LightOffice(String model, String type, String url, String manufacturer, String country, String diffuser, String power, int luminousFlux, int luminousFluxEmergency, String temperatureGlow, String size, String sizeInstallation, String coefficientPulsation, String coefficientPower, String typeLidc, String security, String weight, String temperatureWork, String guarantee) {
        this.model = model;
        this.type = type;
        this.url = url;
        this.manufacturer = manufacturer;
        this.country = country;
        this.diffuser = diffuser;
        this.power = power;
        this.luminousFlux = luminousFlux;
        this.luminousFluxEmergency = luminousFluxEmergency;
        this.temperatureGlow = temperatureGlow;
        this.size = size;
        this.sizeInstallation = sizeInstallation;
        this.coefficientPulsation = coefficientPulsation;
        this.coefficientPower = coefficientPower;
        this.typeLidc = typeLidc;
        this.security = security;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getDiffuser() {
        return diffuser;
    }

    public void setDiffuser(String diffuser) {
        this.diffuser = diffuser;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getLuminousFlux() {
        return luminousFlux;
    }

    public void setLuminousFlux(int luminousFlux) {
        this.luminousFlux = luminousFlux;
    }

    public int getLuminousFluxEmergency() {
        return luminousFluxEmergency;
    }

    public void setLuminousFluxEmergency(int luminousFluxEmergency) {
        this.luminousFluxEmergency = luminousFluxEmergency;
    }

    public String getTemperatureGlow() {
        return temperatureGlow;
    }

    public void setTemperatureGlow(String temperatureGlow) {
        this.temperatureGlow = temperatureGlow;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSizeInstallation() {
        return sizeInstallation;
    }

    public void setSizeInstallation(String sizeInstallation) {
        this.sizeInstallation = sizeInstallation;
    }

    public String getCoefficientPulsation() {
        return coefficientPulsation;
    }

    public void setCoefficientPulsation(String coefficientPulsation) {
        this.coefficientPulsation = coefficientPulsation;
    }

    public String getCoefficientPower() {
        return coefficientPower;
    }

    public void setCoefficientPower(String coefficientPower) {
        this.coefficientPower = coefficientPower;
    }

    public String getTypeLidc() {
        return typeLidc;
    }

    public void setTypeLidc(String typeLidc) {
        this.typeLidc = typeLidc;
    }

    public String getIndexColor() {
        return indexColor;
    }

    public void setIndexColor(String indexColor) {
        this.indexColor = indexColor;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
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

    public String getDimmingFunction() {
        return dimmingFunction;
    }

    public void setDimmingFunction(String dimmingFunction) {
        this.dimmingFunction = dimmingFunction;
    }

    public String getMountingType() {
        return mountingType;
    }

    public void setMountingType(String mountingType) {
        this.mountingType = mountingType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPhoto1() {
        return "light/office/" +   photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return "light/office/" +   photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return "light/office/" +   photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
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
        if (!(object instanceof LightOffice)) {
            return false;
        }
        LightOffice other = (LightOffice) object;
        if ((this.model == null && other.model != null) || (this.model != null && !this.model.equals(other.model))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springapp.light.domain.LightOffice[ model=" + model + " ]";
    }

    public String getPhoto4() {
        return "light/office/" +  photo4;
    }

    public void setPhoto4(String photo4) {
        this.photo4 = photo4;
    }

    public String getPhoto5() {
        return "light/office/" +  photo5;
    }

    public void setPhoto5(String photo5) {
        this.photo5 = photo5;
    }
    
}
