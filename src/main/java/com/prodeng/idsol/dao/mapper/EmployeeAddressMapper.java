package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.EmployeeAddress;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EmployeeAddressMapper {

    @Select("SELECT * FROM employeeaddress WHERE EmpCode = #{empCode}")
    EmployeeAddress getEmployeeAddress(@Param("empCode") String empCode);

    @Select("SELECT * FROM employeeaddress")
    List<EmployeeAddress> getAllEmployeeAddress();

    @Insert("INSERT INTO employeeaddress (EmpCode, SerialNo, AddressType, AddressLine1, AddressLine2, City, State, Country, PostalCode, PhoneNo) " +
            "VALUES (#{empCode}, #{serialNo}, #{addressType}, #{addressLine1}, #{addressLine2}, #{city}, #{state}, #{country}, #{postalCode}, #{phoneNo})")
    void saveEmployeeAddress(EmployeeAddress employeeAddress);

    @Update("UPDATE employeeaddress set SerialNo = #{serialNo}, AddressType = #{addressType}, AddressLine1 = #{addressLine1}, AddressLine2 = #{addressLine2}, City = #{city}, State = #{state}, " +
            "Country = #{country}, PostalCode = #{postalCode}, PhoneNo = #{phoneNo} WHERE EmpCode = #{empCode}")
    void updateEmployeeAddress(EmployeeAddress employeeAddress);

    @Delete("DELETE FROM employeeaddress WHERE EmpCode = #{empCode}")
    void deleteEmployeeAddress(@Param("empCode") String empCode);

}
