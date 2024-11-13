package com.springsecurity.employee_svcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/status")
    public String getAppStatus() {
        return "Employee application is up and running.......";
    }
}