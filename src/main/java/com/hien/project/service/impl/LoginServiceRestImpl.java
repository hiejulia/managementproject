package com.hien.project.service.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.hien.project.dao.LoginDao;
import com.hien.project.model.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// CXF-REST
@Component
@Path("/loginServiceRest")
public class LoginServiceRestImpl {

    // LoginDao
    @Autowired
    private LoginDao loginDao;

    // Get User Accounts : rest controller
    @GET
    @Path("/getUserAccounts")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserAccounts() {
        return Response.ok()
                .entity(new GenericEntity<List<User>>(loginDao.getUsers()) {
                    // loginDao.getUsers()
                }).build();
    }

}
