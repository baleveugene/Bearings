/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.domain.manufacturer.machinescnc;

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
@Table(name="lathe_for_manufacturer", schema = "", catalog = "qjvmhoia_hmc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LatheForManufacturer.findAll", query = "SELECT l FROM LatheForManufacturer l"),
    @NamedQuery(name = "LatheForManufacturer.findByType", query = "SELECT l FROM LatheForManufacturer l WHERE l.type = :type"),
    @NamedQuery(name = "LatheForManufacturer.findByModel", query = "SELECT l FROM LatheForManufacturer l WHERE l.model = :model"),
    @NamedQuery(name = "LatheForManufacturer.findByUrl", query = "SELECT l FROM LatheForManufacturer l WHERE l.url = :url"),
    @NamedQuery(name = "LatheForManufacturer.findByManufacturer", query = "SELECT l FROM LatheForManufacturer l WHERE l.manufacturer = :manufacturer"),
    @NamedQuery(name = "LatheForManufacturer.findByCountry", query = "SELECT l FROM LatheForManufacturer l WHERE l.country = :country"),
    @NamedQuery(name = "LatheForManufacturer.findBySystemCnc", query = "SELECT l FROM LatheForManufacturer l WHERE l.systemCnc = :systemCnc"),
    @NamedQuery(name = "LatheForManufacturer.findByFullSystemCnc", query = "SELECT l FROM LatheForManufacturer l WHERE l.fullSystemCnc = :fullSystemCnc"),
    @NamedQuery(name = "LatheForManufacturer.findByAxisCount", query = "SELECT l FROM LatheForManufacturer l WHERE l.axisCount = :axisCount"),
    @NamedQuery(name = "LatheForManufacturer.findByDiameterMax", query = "SELECT l FROM LatheForManufacturer l WHERE l.diameterMax = :diameterMax"),
    @NamedQuery(name = "LatheForManufacturer.findByDiameter", query = "SELECT l FROM LatheForManufacturer l WHERE l.diameter = :diameter"),
    @NamedQuery(name = "LatheForManufacturer.findByDiameterBar", query = "SELECT l FROM LatheForManufacturer l WHERE l.diameterBar = :diameterBar"),
    @NamedQuery(name = "LatheForManufacturer.findByLengthMax", query = "SELECT l FROM LatheForManufacturer l WHERE l.lengthMax = :lengthMax"),
    @NamedQuery(name = "LatheForManufacturer.findByX", query = "SELECT l FROM LatheForManufacturer l WHERE l.x = :x"),
    @NamedQuery(name = "LatheForManufacturer.findByY", query = "SELECT l FROM LatheForManufacturer l WHERE l.y = :y"),
    @NamedQuery(name = "LatheForManufacturer.findByZ", query = "SELECT l FROM LatheForManufacturer l WHERE l.z = :z"),
    @NamedQuery(name = "LatheForManufacturer.findBySpindleSpeed", query = "SELECT l FROM LatheForManufacturer l WHERE l.spindleSpeed = :spindleSpeed"),
    @NamedQuery(name = "LatheForManufacturer.findBySpindlePower", query = "SELECT l FROM LatheForManufacturer l WHERE l.spindlePower = :spindlePower"),
    @NamedQuery(name = "LatheForManufacturer.findBySpindleDiameter", query = "SELECT l FROM LatheForManufacturer l WHERE l.spindleDiameter = :spindleDiameter"),
    @NamedQuery(name = "LatheForManufacturer.findBySubspindle", query = "SELECT l FROM LatheForManufacturer l WHERE l.subspindle = :subspindle"),
    @NamedQuery(name = "LatheForManufacturer.findBySubspindleSpeed", query = "SELECT l FROM LatheForManufacturer l WHERE l.subspindleSpeed = :subspindleSpeed"),
    @NamedQuery(name = "LatheForManufacturer.findByVdi", query = "SELECT l FROM LatheForManufacturer l WHERE l.vdi = :vdi"),
    @NamedQuery(name = "LatheForManufacturer.findByToolsAll", query = "SELECT l FROM LatheForManufacturer l WHERE l.toolsAll = :toolsAll"),
    @NamedQuery(name = "LatheForManufacturer.findByToolsLive", query = "SELECT l FROM LatheForManufacturer l WHERE l.toolsLive = :toolsLive"),
    @NamedQuery(name = "LatheForManufacturer.findByToolsnotlive", query = "SELECT l FROM LatheForManufacturer l WHERE l.toolsnotlive = :toolsnotlive"),
    @NamedQuery(name = "LatheForManufacturer.findByTailstock", query = "SELECT l FROM LatheForManufacturer l WHERE l.tailstock = :tailstock"),
    @NamedQuery(name = "LatheForManufacturer.findByAccuracy", query = "SELECT l FROM LatheForManufacturer l WHERE l.accuracy = :accuracy"),
    @NamedQuery(name = "LatheForManufacturer.findByAccuracyAxisC", query = "SELECT l FROM LatheForManufacturer l WHERE l.accuracyAxisC = :accuracyAxisC"),
    @NamedQuery(name = "LatheForManufacturer.findByPhoto1", query = "SELECT l FROM LatheForManufacturer l WHERE l.photo1 = :photo1"),
    @NamedQuery(name = "LatheForManufacturer.findByPhoto2", query = "SELECT l FROM LatheForManufacturer l WHERE l.photo2 = :photo2"),
    @NamedQuery(name = "LatheForManufacturer.findByPhoto3", query = "SELECT l FROM LatheForManufacturer l WHERE l.photo3 = :photo3"),
    @NamedQuery(name = "LatheForManufacturer.findByPhoto4", query = "SELECT l FROM LatheForManufacturer l WHERE l.photo4 = :photo4"),
    @NamedQuery(name = "LatheForManufacturer.findByPhoto5", query = "SELECT l FROM LatheForManufacturer l WHERE l.photo5 = :photo5"),
    @NamedQuery(name = "LatheForManufacturer.findByVideo1", query = "SELECT l FROM LatheForManufacturer l WHERE l.video1 = :video1"),
    @NamedQuery(name = "LatheForManufacturer.findByVideo2", query = "SELECT l FROM LatheForManufacturer l WHERE l.video2 = :video2"),
    @NamedQuery(name = "LatheForManufacturer.findByVideo3", query = "SELECT l FROM LatheForManufacturer l WHERE l.video3 = :video3")})
public class LatheForManufacturer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "type")
    private String type;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "model")
    private String model;
    @Size(max = 45)
    @Column(name = "url")
    private String url;
    @Size(max = 45)
    @Column(name = "manufacturer")
    private String manufacturer;
    @Size(max = 45)
    @Column(name = "country")
    private String country;
    @Size(max = 45)
    @Column(name = "system_cnc")
    private String systemCnc;
    @Size(max = 45)
    @Column(name = "full_system_cnc")
    private String fullSystemCnc;
    @Column(name = "axisCount")
    private Integer axisCount;
    @Column(name = "diameter_max")
    private Integer diameterMax;
    @Column(name = "diameter")
    private Integer diameter;
    @Column(name = "diameter_bar")
    private Integer diameterBar;
    @Column(name = "length_max")
    private Integer lengthMax;
    @Column(name = "x")
    private Integer x;
    @Column(name = "y")
    private Integer y;
    @Column(name = "z")
    private Integer z;
    @Column(name = "spindle_speed")
    private Integer spindleSpeed;
    @Size(max = 45)
    @Column(name = "spindle_power")
    private String spindlePower;
    @Column(name = "spindle_diameter")
    private Integer spindleDiameter;
    @Size(max = 11)
    @Column(name = "subspindle")
    private String subspindle;
    @Column(name = "subspindle_speed")
    private Integer subspindleSpeed;
    @Size(max = 45)
    @Column(name = "vdi")
    private String vdi;
    @Size(max = 10)
    @Column(name = "tools_all")
    private String toolsAll;
    @Size(max = 10)
    @Column(name = "tools_live")
    private String toolsLive;
    @Size(max = 10)
    @Column(name = "toolsnotlive")
    private String toolsnotlive;
    @Size(max = 100)
    @Column(name = "tailstock")
    private String tailstock;
    @Size(max = 100)
    @Column(name = "accuracy")
    private String accuracy;
    @Size(max = 100)
    @Column(name = "accuracyAxisC")
    private String accuracyAxisC;
    @Size(max = 100)
    @Column(name = "photo1")
    private String photo1;
    @Size(max = 100)
    @Column(name = "photo2")
    private String photo2;
    @Size(max = 100)
    @Column(name = "photo3")
    private String photo3;
    @Size(max = 100)
    @Column(name = "photo4")
    private String photo4;
    @Size(max = 100)
    @Column(name = "photo5")
    private String photo5;
    @Lob
    @Size(max = 65535)
    @Column(name = "description_en")
    private String descriptionEn;
    @Size(max = 150)
    @Column(name = "video1")
    private String video1;
    @Size(max = 150)
    @Column(name = "video2")
    private String video2;
    @Size(max = 150)
    @Column(name = "video3")
    private String video3;

    public LatheForManufacturer() {
    }

    public LatheForManufacturer(String model) {
        this.model = model;
    }

    public LatheForManufacturer(String model, String type) {
        this.model = model;
        this.type = type;
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

    public String getSystemCnc() {
        return systemCnc;
    }

    public void setSystemCnc(String systemCnc) {
        this.systemCnc = systemCnc;
    }

    public String getFullSystemCnc() {
        return fullSystemCnc;
    }

    public void setFullSystemCnc(String fullSystemCnc) {
        this.fullSystemCnc = fullSystemCnc;
    }

    public Integer getAxisCount() {
        return axisCount;
    }

    public void setAxisCount(Integer axisCount) {
        this.axisCount = axisCount;
    }

    public Integer getDiameterMax() {
        return diameterMax;
    }

    public void setDiameterMax(Integer diameterMax) {
        this.diameterMax = diameterMax;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getDiameterBar() {
        return diameterBar;
    }

    public void setDiameterBar(Integer diameterBar) {
        this.diameterBar = diameterBar;
    }

    public Integer getLengthMax() {
        return lengthMax;
    }

    public void setLengthMax(Integer lengthMax) {
        this.lengthMax = lengthMax;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getSpindleSpeed() {
        return spindleSpeed;
    }

    public void setSpindleSpeed(Integer spindleSpeed) {
        this.spindleSpeed = spindleSpeed;
    }

    public String getSpindlePower() {
        return spindlePower;
    }

    public void setSpindlePower(String spindlePower) {
        this.spindlePower = spindlePower;
    }

    public Integer getSpindleDiameter() {
        return spindleDiameter;
    }

    public void setSpindleDiameter(Integer spindleDiameter) {
        this.spindleDiameter = spindleDiameter;
    }

    public String getSubspindle() {
        return subspindle;
    }

    public void setSubspindle(String subspindle) {
        this.subspindle = subspindle;
    }

    public Integer getSubspindleSpeed() {
        return subspindleSpeed;
    }

    public void setSubspindleSpeed(Integer subspindleSpeed) {
        this.subspindleSpeed = subspindleSpeed;
    }

    public String getVdi() {
        return vdi;
    }

    public void setVdi(String vdi) {
        this.vdi = vdi;
    }

    public String getToolsAll() {
        return toolsAll;
    }

    public void setToolsAll(String toolsAll) {
        this.toolsAll = toolsAll;
    }

    public String getToolsLive() {
        return toolsLive;
    }

    public void setToolsLive(String toolsLive) {
        this.toolsLive = toolsLive;
    }

    public String getToolsnotlive() {
        return toolsnotlive;
    }

    public void setToolsnotlive(String toolsnotlive) {
        this.toolsnotlive = toolsnotlive;
    }

    public String getTailstock() {
        return tailstock;
    }

    public void setTailstock(String tailstock) {
        this.tailstock = tailstock;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getAccuracyAxisC() {
        return accuracyAxisC;
    }

    public void setAccuracyAxisC(String accuracyAxisC) {
        this.accuracyAxisC = accuracyAxisC;
    }

    public String getPhoto1() {
        return "lathe_manuf/"+ photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return "lathe_manuf/"+ photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return "lathe_manuf/"+ photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    public String getPhoto4() {
        return "lathe_manuf/"+ photo4;
    }

    public void setPhoto4(String photo4) {
        this.photo4 = photo4;
    }

    public String getPhoto5() {
        return "lathe_manuf/"+ photo5;
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
        hash += (model != null ? model.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LatheForManufacturer)) {
            return false;
        }
        LatheForManufacturer other = (LatheForManufacturer) object;
        if ((this.model == null && other.model != null) || (this.model != null && !this.model.equals(other.model))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LatheForManufacturer{" + "\ntype=" + type + ",\nmodel=" + model + ",\nurl=" + url + ",\nmanufacturer=" + manufacturer + ",\ncountry=" + country + ",\nsystemCnc=" + systemCnc + ",\nfullSystemCnc=" + fullSystemCnc + ",\naxisCount=" + axisCount + ",\ndiameterMax=" + diameterMax + ",\ndiameter=" + diameter + ",\ndiameterBar=" + diameterBar + ",\nlengthMax=" + lengthMax + ",\nx=" + x + ",\ny=" + y + ",\nz=" + z + ",\nspindleSpeed=" + spindleSpeed + ",\nspindlePower=" + spindlePower + ",\nspindleDiameter=" + spindleDiameter + ",\nsubspindle=" + subspindle + ",\nsubspindleSpeed=" + subspindleSpeed + ",\nvdi=" + vdi + ",\ntoolsAll=" + toolsAll + ",\ntoolsLive=" + toolsLive + ",\ntoolsnotlive=" + toolsnotlive + ",\ntailstock=" + tailstock + ",\naccuracy=" + accuracy + ",\naccuracyAxisC=" + accuracyAxisC + ",\nphoto1=" + photo1 + ",\nphoto2=" + photo2 + ",\nphoto3=" + photo3 + ",\nphoto4=" + photo4 + ",\nphoto5=" + photo5 + ",\ndescriptionEn=" + descriptionEn + ",\nvideo1=" + video1 + ",\nvideo2=" + video2 + ",\nvideo3=" + video3 + '}';
    }


    
}
