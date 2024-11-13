package com.springsecurity.organization_svcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @GetMapping("/status")
    public String getAppStatus(){
        return "Organization application is up and running.......";
    }
}
