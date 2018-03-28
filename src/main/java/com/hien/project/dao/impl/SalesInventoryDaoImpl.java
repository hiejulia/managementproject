package com.hien.project.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;


import com.hien.project.dao.SalesInventoryDao;
import com.hien.project.model.data.Contact;
import com.hien.project.model.data.Supplier;
import org.springframework.stereotype.Repository;


@Transactional
@Repository
public class SalesInventoryDaoImpl implements SalesInventoryDao {

    @PersistenceContext(unitName="erpPersistencySales")
    EntityManager em;

    @Transactional
    @Override
    public List<Supplier> getSuppliers() {
        String sql = "SELECT s FROM Supplier s";
        TypedQuery<Supplier> query = em.createQuery(sql, Supplier.class);
        return query.getResultList();
    }

    @Transactional
    @Override
    public Contact getContact(Integer id) {
        String sql = "SELECT c FROM Contact c where c.id = ?1";
        TypedQuery<Contact> query = em.createQuery(sql, Contact.class);
        query.setParameter(1, id);
        return query.getSingleResult();
    }

}
