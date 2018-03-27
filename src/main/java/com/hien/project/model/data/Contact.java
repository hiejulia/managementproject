package com.hien.project.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact", catalog = "erp_sales")
public class Contact implements java.io.Serializable {

    // Contact : id, fax, email, tel
    private Integer id;

    private String fax;

    private String email;

    private String telephone;

    public Contact() {
    }

    public Contact(String fax, String email, String telephone) {
        this.fax = fax;
        this.email = email;
        this.telephone = telephone;
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

    @Column(name = "fax", nullable = false, length = 45)
    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "telephone", nullable = false, length = 45)
    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
