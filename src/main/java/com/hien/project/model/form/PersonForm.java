package com.hien.project.model.form;

import lombok.Data;

import java.util.Date;

@Data
public class PersonForm {

    private String firstName;

    private String middleName;

    private String lastName;

    private Date birthdate;

    private String address;

    private String mobile;

    private String telephone;

    private String email;

    private String position;
}
