package com.aptota.easybankbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/loans")
public class LoanController {

    @GetMapping
    public String getX(){
        return "Getting loans details of easy bank customer";
    }

}
