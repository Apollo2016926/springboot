package com.xxx.springboot.controller;

import com.xxx.springboot.dao.DepartmentDao;
import com.xxx.springboot.dao.EmployeeDao;
import com.xxx.springboot.entities.Department;
import com.xxx.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

@Controller
public class EmployeeCntroller {
    @Autowired
    EmployeeDao EmployeeDao;
    @Autowired
    DepartmentDao DepartmentDao;

    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = EmployeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = DepartmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }
    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        System.out.println(employee);
        EmployeeDao.save(employee);

        return "redirect:/emps";
    }
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model) {
        Employee employee = EmployeeDao.get(id);
        Collection<Department> departments = DepartmentDao.getDepartments();
        model.addAttribute("depts",departments);
        model.addAttribute("emp",employee);

        return "emp/add";
    }


}
