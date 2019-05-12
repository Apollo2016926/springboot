package com.xxx.springboot;

import com.xxx.springboot.bean.Employee;
import com.xxx.springboot.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCacheApplicationTests {
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void contextLoads() {
        Employee employee =new Employee() ;
        employee.setEmail("9446460@qq.com");
        employee.setGender(1);
        employee.setLastName("阿尔法");
        employee.setDid(5);
        employeeMapper.insertEmp(employee);
    }

}
