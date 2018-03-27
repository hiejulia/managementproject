package com.hien.project.model.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity(name = "catalog")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "catalog", catalog = "erp_catalog")
public class Catalog implements java.io.Serializable {

    private Integer id;

    //@XmlElementWrapper(name = "catalogs")
    private MaterialType materialType;

    //@XmlElementWrapper(name = "catalogs")
    private Uom uom;
    private String name;
    private double costPrice;
    private Double wholesalePrice;
    private Double retailPrice;
    private String description;
    private String tags;
    private int stock;
    private int supplierId;

    public Catalog() {
    }

    public Catalog(MaterialType materialType, Uom uom, String name,
                   double costPrice, int stock, int supplierId) {
        this.materialType = materialType;
        this.uom = uom;
        this.name = name;
        this.costPrice = costPrice;
        this.stock = stock;
        this.supplierId = supplierId;
    }

    public Catalog(MaterialType materialType, Uom uom, String name,
                   double costPrice, Double wholesalePrice, Double retailPrice,
                   String description, String tags, int stock, int supplierId) {
        this.materialType = materialType;
        this.uom = uom;
        this.name = name;
        this.costPrice = costPrice;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.description = description;
        this.tags = tags;
        this.stock = stock;
        this.supplierId = supplierId;
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



    @JsonBackReference("materialType-type")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tid", nullable = false)
    public MaterialType getMaterialType() {
        return this.materialType;
    }


    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }


    //(name = "catalogs")
    @JsonBackReference("uom-type")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uomId", nullable = false)
    public Uom getUom() {
        return this.uom;
    }

    public void setUom(Uom uom) {
        this.uom = uom;
    }

    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "cost_price", nullable = false, precision = 10)
    public double getCostPrice() {
        return this.costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    @Column(name = "wholesale_price", precision = 10)
    public Double getWholesalePrice() {
        return this.wholesalePrice;
    }

    public void setWholesalePrice(Double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    @Column(name = "retail_price", precision = 10)
    public Double getRetailPrice() {
        return this.retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Column(name = "description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "tags", length = 45)
    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Column(name = "stock", nullable = false)
    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Column(name = "supplierId", nullable = false)
    public int getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

}
