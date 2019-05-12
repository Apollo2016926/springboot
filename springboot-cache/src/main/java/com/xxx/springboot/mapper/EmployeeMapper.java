package com.xxx.springboot.mapper;

import com.xxx.springboot.bean.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employee where id= #{id}")
    public Employee getEmpById(Integer id);

    @Update("Update employee set lastName=#{lastName} ,email=#{email},gender=#{gender},d_Id=#{did} where id=#{id}")
    public void updateEMp(Employee employee);

    @Delete("Delete From employee where id=#{id}")
    public void deleteEmpById(Integer id);

    @Insert("insert into employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{did})")
    public void insertEmp(Employee employee);
}
