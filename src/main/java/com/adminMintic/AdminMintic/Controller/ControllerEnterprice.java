package com.adminMintic.AdminMintic.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEnterprice {

    @GetMapping("/")
    public String prueba(){

        return "I'm mastering Java Spring Boot and nobody can stop me";
    }
}
