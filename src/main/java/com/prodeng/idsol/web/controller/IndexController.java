package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.EmployeeAddress;
import com.prodeng.idsol.dao.mapper.EmployeeAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;

    @Autowired
    private EmployeeAddressMapper employeeAddressMapper;

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);

        EmployeeAddress employeeAddress = employeeAddressMapper.getEmployeeAddress("S00001");
        System.out.println(employeeAddress.toString());
        return "index"; //view
    }

    // /hello?name=kotlin
    @GetMapping("/hello")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "")
            String name, Model model) {

        model.addAttribute("message", name);

        return "index"; //view
    }

}
