package com.xxx.springboot.service;

import com.xxx.springboot.bean.Employee;
import com.xxx.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = "emp")
    public Employee getEmpById(Integer id) {
        System.out.println("查询数据库");
        Employee empById = employeeMapper.getEmpById(id);
        return empById;
    }
    @CachePut(value = "emp",key = "#Employee.id")
    public Employee udateEMp(Employee Employee) {
        System.out.println("更新数据库");
        employeeMapper.updateEMp(Employee);
        return Employee;
    }
}
