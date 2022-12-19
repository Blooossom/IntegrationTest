package com.example.integrationtest.controller.member;


import com.example.integrationtest.dto.member.ContactDTO;
import com.example.integrationtest.service.member.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    ContactService cs;


    @PostMapping("/requestCall")
    public String requestCall(ContactDTO contactDTO){
        cs.requestCall(contactDTO);
        return "index";
    }
}
