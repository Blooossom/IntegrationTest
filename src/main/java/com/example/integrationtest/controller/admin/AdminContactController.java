package com.example.integrationtest.controller.admin;


import com.example.integrationtest.dto.member.ContactDTO;
import com.example.integrationtest.service.admin.AdminContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdminContactController {

    @Autowired
    AdminContactService acs;

    @GetMapping("contactList")
    public ArrayList<ContactDTO> contactList(){
        return acs.contactList();
    }



}
