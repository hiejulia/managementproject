package com.hien.project.model.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "invoiced_products", catalog = "erp_receivable")
public class InvoicedProducts implements java.io.Serializable {

    private Integer id;
    private Invoice invoice;
    private int invId;
    private int catId;
    private int qty;

    public InvoicedProducts() {
    }

    public InvoicedProducts(Invoice invoice, int invId, int catId, int qty) {
        this.invoice = invoice;
        this.invId = invId;
        this.catId = catId;
        this.qty = qty;
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "invoice"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Invoice getInvoice() {
        return this.invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Column(name = "invId", nullable = false)
    public int getInvId() {
        return this.invId;
    }

    public void setInvId(int invId) {
        this.invId = invId;
    }

    @Column(name = "catId", nullable = false)
    public int getCatId() {
        return this.catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    @Column(name = "qty", nullable = false)
    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
