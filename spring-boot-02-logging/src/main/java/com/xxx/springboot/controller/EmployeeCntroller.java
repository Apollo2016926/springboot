package com.xxx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeCntroller {



    @GetMapping("/emps")
    public String list() {


        return "emp/list";
    }
}
