package com.hien.project.service;

import com.hien.project.model.data.User;
import com.hien.project.model.form.SignupForm;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;



// Proxy for CXF - Document-based
@WebService(targetNamespace = "/loginServiceWS")
public interface LoginService {

    public void addUserAccount(@WebParam(name="signupForm") SignupForm signupForm);
    public @WebResult(name="user")
    User getUserAccount(@WebParam(name="id") Integer id);
    public @WebResult(name="users") List<User> getUserAccounts();

}
