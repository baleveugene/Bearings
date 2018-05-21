/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.domain.letter;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name="letter", schema = "", catalog = "qjvmhoia_hmc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Letter.findAll", query = "SELECT l FROM Letter l"),
    @NamedQuery(name = "Letter.findById", query = "SELECT l FROM Letter l WHERE l.id = :id"),
    @NamedQuery(name = "Letter.findByData", query = "SELECT l FROM Letter l WHERE l.data = :data"),
    @NamedQuery(name = "Letter.findByTypeofletter", query = "SELECT l FROM Letter l WHERE l.typeofletter = :typeofletter"),
    @NamedQuery(name = "Letter.findByWebsite", query = "SELECT l FROM Letter l WHERE l.website = :website"),
    @NamedQuery(name = "Letter.findByCompany", query = "SELECT l FROM Letter l WHERE l.company = :company"),
    @NamedQuery(name = "Letter.findByPosition", query = "SELECT l FROM Letter l WHERE l.position = :position"),
    @NamedQuery(name = "Letter.findByContactName", query = "SELECT l FROM Letter l WHERE l.contactName = :contactName"),
    @NamedQuery(name = "Letter.findByAddress", query = "SELECT l FROM Letter l WHERE l.address = :address"),
    @NamedQuery(name = "Letter.findByEmail", query = "SELECT l FROM Letter l WHERE l.email = :email"),
    @NamedQuery(name = "Letter.findByManager", query = "SELECT l FROM Letter l WHERE l.manager = :manager"),
    @NamedQuery(name = "Letter.findByEmailmanager", query = "SELECT l FROM Letter l WHERE l.emailmanager = :emailmanager"),
    @NamedQuery(name = "Letter.findByPhonemanager", query = "SELECT l FROM Letter l WHERE l.phonemanager = :phonemanager")})
public class Letter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Size(max = 50)
    @Column(name = "data")
    private String data;
    
    @Size(max = 245)
    @Column(name = "typeofletter")
    private String typeofletter;
    @Size(max = 250)
    @Column(name = "website")
    private String website;
    @Size(max = 245)
    @Column(name = "company")
    private String company;
    @Size(max = 250)
    @Column(name = "position")
    private String position;
    @Size(max = 245)
    @Column(name = "contact_name")
    private String contactName;
    @Size(max = 255)
    @Column(name = "address")
    private String address;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Недопустимый адрес электронной почты")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Lob
    @Size(max = 65535)
    @Column(name = "discription")
    private String discription;
    @Size(max = 245)
    @Column(name = "manager")
    private String manager;
    @Size(max = 245)
    @Column(name = "emailmanager")
    private String emailmanager;
    @Size(max = 245)
    @Column(name = "phonemanager")
    private String phonemanager;

    public Letter() {
    }

    public Letter(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTypeofletter() {
        return typeofletter;
    }

    public void setTypeofletter(String typeofletter) {
        this.typeofletter = typeofletter;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getEmailmanager() {
        return emailmanager;
    }

    public void setEmailmanager(String emailmanager) {
        this.emailmanager = emailmanager;
    }

    public String getPhonemanager() {
        return phonemanager;
    }

    public void setPhonemanager(String phonemanager) {
        this.phonemanager = phonemanager;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Letter)) {
            return false;
        }
        Letter other = (Letter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Letter{" + "id=" + id + ", data=" + data + ", typeofletter=" + typeofletter + ", website=" + website + ", company=" + company + ", position=" + position + ", contactName=" + contactName + ", address=" + address + ", email=" + email + ", discription=" + discription + ", manager=" + manager + ", emailmanager=" + emailmanager + ", phonemanager=" + phonemanager + '}';
    }


    
}
