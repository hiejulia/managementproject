package com.hien.project.dao.impl;


import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import com.hien.project.dao.LoginDao;
import com.hien.project.model.data.Login;
import com.hien.project.model.data.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class LoginDaoImpl implements LoginDao {

    @PersistenceContext(unitName="erpPersistencyAdmin")
    EntityManager entityManagerFactoryAdmin;

    // create new user
    @Transactional
    @Override
    public void setUser(User user) {
        entityManagerFactoryAdmin.persist(user);
        entityManagerFactoryAdmin.flush();

    }

    @Transactional
    @Override
    public void setLogin(Login login) {
        entityManagerFactoryAdmin.persist(login);
        entityManagerFactoryAdmin.flush();

    }

    // get login credentials - id and username
    @Transactional
    @Override
    public Login getLoginCredential(Integer id, String username) {
        String qlString = "SELECT l FROM Login l WHERE l.id = ?1 and l.username like ?2";
        TypedQuery<Login> query = entityManagerFactoryAdmin.createQuery(qlString, Login.class);
        query.setParameter(1, id);
        query.setParameter(2, username);
        return query.getSingleResult();
    }

    // get user profile
    @Transactional(readOnly = true)
    @Override
    public User getUserProfile(Integer id) {
        String qlString = "SELECT u FROM User u WHERE u.id = ?1";
        TypedQuery<User> query = entityManagerFactoryAdmin.createQuery(qlString, User.class);
        query.setParameter(1, id);
        return query.getSingleResult();
    }

    // get user by id

    @Transactional(readOnly = true)
    public User getUserById(Integer id){
        String qlString = "SELECT u FROM User u WHERE u.id = ?1";
        TypedQuery<User> query = entityManagerFactoryAdmin.createQuery(qlString, User.class);
        query.setParameter(1, id);
        return query.getSingleResult();
    }


    // get all users
    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        String sql = "SELECT u FROM User u";
        TypedQuery<User> query = entityManagerFactoryAdmin.createQuery(sql, User.class);
        return query.getResultList();
    }

}
