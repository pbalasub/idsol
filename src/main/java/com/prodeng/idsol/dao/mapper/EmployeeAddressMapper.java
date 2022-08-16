package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.EmployeeAddress;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EmployeeAddressMapper {

    @Select("SELECT * FROM employeeaddress WHERE EmpCode = #{empCode}")
    EmployeeAddress getEmployeeAddress(@Param("empCode") String empCode);

}
