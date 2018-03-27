package com.hien.project.dao;


import com.hien.project.model.data.Login;
import com.hien.project.model.data.User;

import java.util.List;




public interface LoginDao {

    public void setUser(User user);

    public void setLogin(Login login);

    public Login getLoginCredential(Integer id, String username);

    public User getUserProfile(Integer id);
    
    public List<User> getUsers();

}
