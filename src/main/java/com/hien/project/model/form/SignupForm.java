package com.hien.project.model.form;


import lombok.Data;

import java.util.Date;

@Data
public class SignupForm {

    private String firstName;

    private String middleName;

    private String lastName;

    private Date birthDate;

    private Integer age;

    private String role;

    private String username;

    private String password;
}
