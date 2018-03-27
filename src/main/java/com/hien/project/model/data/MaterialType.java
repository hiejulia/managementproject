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
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonManagedReference;



@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "material_type", catalog = "erp_catalog")
public class MaterialType implements java.io.Serializable {

    private Integer id;
    private String name;

    @XmlTransient
    //@XmlElementWrapper(name = "catalogs")
    private Set<Catalog> catalogs = new HashSet<Catalog>(0);

    public MaterialType() {
    }

    public MaterialType(String name) {
        this.name = name;
    }

    public MaterialType(String name, Set<Catalog> catalogs) {
        this.name = name;
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

    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    @JsonBackReference("materialType-type")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "materialType")
    public Set<Catalog> getCatalogs() {
        return this.catalogs;
    }

    public void setCatalogs(Set<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

}
