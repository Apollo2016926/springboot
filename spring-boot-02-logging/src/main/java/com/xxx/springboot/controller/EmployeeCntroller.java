package com.xxx.springboot.controller;

import com.xxx.springboot.dao.EmployeeDao;
import com.xxx.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeCntroller {
    @Autowired
    EmployeeDao EmployeeDao;

    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = EmployeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }
}
