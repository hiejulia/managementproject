package com.hien.project.model.data;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonManagedReference;



@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "uom", catalog = "erp_catalog")
public class Uom implements java.io.Serializable {

    // Uom : id, unit
    private Integer id;
    private String unit;

    @XmlTransient
    //@XmlElementWrapper(name = "catalogs")
    private Set<Catalog> catalogs = new HashSet<Catalog>(0);

    public Uom() {
    }

    public Uom(String unit) {
        this.unit = unit;
    }

    public Uom(String unit, Set<Catalog> catalogs) {
        this.unit = unit;
        this.catalogs = catalogs;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "unit", nullable = false, length = 45)
    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonBackReference("uom-type")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "uom")
    public Set<Catalog> getCatalogs() {
        return this.catalogs;
    }

    public void setCatalogs(Set<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

}
