package com.aptota.easybankbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notices")
public class NoticeController {

    @GetMapping
    public String getX(){
        return "Getting list of notices from easy bank.";
    }

}
