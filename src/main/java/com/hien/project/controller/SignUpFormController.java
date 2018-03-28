package com.hien.project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// SignUpFormControllelr
@Controller
@RequestMapping("/erp/signup")  //erp / signup
public class SignUpFormController {

    // init form: get the UI of the form
    @RequestMapping(method=RequestMethod.GET)
    public String initForm(Model model){
        return "";
    }

    // submit form :
    @RequestMapping(method=RequestMethod.POST)
    public String submitForm(Model model){
        return "";
    }

}
