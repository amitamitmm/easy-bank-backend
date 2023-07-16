package com.aptota.easybankbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/balances")
public class BalanceController {

    @GetMapping
    public String getX(){
        return "Returning balances from accounts";
    }

}
