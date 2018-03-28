package com.hien.project.service.impl;


import java.util.Date;
import java.util.List;

import javax.jws.WebService;


import com.hien.project.dao.LoginDao;
import com.hien.project.model.data.Login;
import com.hien.project.model.data.User;
import com.hien.project.model.form.SignupForm;
import com.hien.project.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// CXF-WS
@WebService(targetNamespace = "/loginServiceWS")
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    // add user account
    @Override
    public void addUserAccount(SignupForm signupForm) {
        // User -> loginDao.set User
        // Login -> set User id , loginDao.setLogin : login
        User user = new User();
        user.setFirstName(signupForm.getFirstName());
        user.setMiddleName(signupForm.getMiddleName());
        user.setLastName(signupForm.getMiddleName());
        user.setAge(signupForm.getAge());
        user.setBirthDate(new Date());
        user.setRole(signupForm.getRole());

        loginDao.setUser(user);

        Login login = new Login();
        login.setUserId(user.getId() );
        login.setUsername(signupForm.getUsername());
        login.setPassword(signupForm.getPassword());
        loginDao.setLogin(login);

    }



    // get User account by id
    // login dao . get user profile by id
    @Override
    public User getUserAccount(Integer id) {

        return loginDao.getUserProfile(id);
    }

    // get all users accounts
    @Override
    public List<User> getUserAccounts() {
    // loginDao. getUsers
        return loginDao.getUsers();
    }

}
