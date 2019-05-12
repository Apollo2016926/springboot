package com.xxx.springboot.service;

import com.xxx.springboot.bean.Employee;
import com.xxx.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmpById(Integer id) {
        Employee empById = employeeMapper.getEmpById(id);
        return empById;
    }
}
