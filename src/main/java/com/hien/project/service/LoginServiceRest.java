package com.hien.project.service;

import com.hien.project.model.data.User;
import com.hien.project.model.form.SignupForm;

import java.util.List;

import javax.jws.WebParam;
import javax.ws.rs.core.Response;



// Proxy for CXF - Rest
public interface LoginServiceRest {

    // save user account
    public String addUserAccount( SignupForm signupForm);

    // get user account
    public User getUserAccount(@WebParam(name="id") Integer id);


    // get users account
    public Response getUserAccounts();

}
