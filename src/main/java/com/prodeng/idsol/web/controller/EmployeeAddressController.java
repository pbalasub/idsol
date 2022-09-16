package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.EmployeeAddress;
import com.prodeng.idsol.dao.mapper.EmployeeAddressMapper;
import io.swagger.annotations.ApiModelProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employeeAddress")
@Slf4j
public class EmployeeAddressController {

    @Autowired
    private EmployeeAddressMapper employeeAddressMapper;

    @GetMapping("/")
    public List<EmployeeAddress> getAllEmployeeAddress() {
        List<EmployeeAddress> employeeAddresses = employeeAddressMapper.getAllEmployeeAddress();
        return employeeAddresses;
    }

    @GetMapping("/{id}")
    public EmployeeAddress getEmployeeAddressById(@PathVariable(value = "id") String id) {
        EmployeeAddress employeeAddress = employeeAddressMapper.getEmployeeAddress(id);
        log.debug(employeeAddress.toString());
        return employeeAddress;
    }

    @PostMapping("/save")
    public void saveEmployeeAddress(@RequestBody EmployeeAddress employeeAddress ){
        employeeAddressMapper.saveEmployeeAddress(employeeAddress);
        log.debug(employeeAddress.toString());
    }

    @PutMapping("/update/{id}")
    public void updateEmployeeAddress(@PathVariable(value = "id") String id, @RequestBody EmployeeAddress employeeAddress ){
        employeeAddressMapper.updateEmployeeAddress(employeeAddress);
        log.debug(employeeAddress.toString());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeAddress(@PathVariable(value = "id") String id) {
        log.debug("Delete EmployeeAddress: " + id);
        employeeAddressMapper.deleteEmployeeAddress(id);
    }

}
