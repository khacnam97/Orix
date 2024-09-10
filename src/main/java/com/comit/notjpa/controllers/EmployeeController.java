package com.comit.notjpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class EmployeeController {

	@RequestMapping("/")
    public String getEmployees(Model model) {
       
        return "employees/index";
    }
}
