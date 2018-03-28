package com.hien.project.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import com.hien.project.dao.AccountReceivableDao;
import com.hien.project.model.data.InvoicedProducts;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AccountReceivableDaoImpl implements AccountReceivableDao {

    @PersistenceContext(unitName="erpPersistencyAR")
    EntityManager entityManagerFactoryAR;

    @Override
    public InvoicedProducts getInvoicedProduct(Integer id) {
        String sql = "SELECT i FROM InvoicedProducts i where i.id = ?1";
        TypedQuery<InvoicedProducts> query = entityManagerFactoryAR.createQuery(sql, InvoicedProducts.class);
        query.setParameter(1, id);
        return query.getSingleResult();
    }

}
