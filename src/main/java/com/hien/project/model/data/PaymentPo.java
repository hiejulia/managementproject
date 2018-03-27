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


@Entity
@Table(name = "payment_po", catalog = "erp_purchasing")
public class PaymentPo implements java.io.Serializable {

    private Integer id;
    private String term;
    private Set<PurchaseOrder> purchaseOrders = new HashSet<PurchaseOrder>(0);

    public PaymentPo() {
    }

    public PaymentPo(String term) {
        this.term = term;
    }

    public PaymentPo(String term, Set<PurchaseOrder> purchaseOrders) {
        this.term = term;
        this.purchaseOrders = purchaseOrders;
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

    @Column(name = "term", nullable = false, length = 45)
    public String getTerm() {
        return this.term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "paymentPo")
    public Set<PurchaseOrder> getPurchaseOrders() {
        return this.purchaseOrders;
    }

    public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

}
