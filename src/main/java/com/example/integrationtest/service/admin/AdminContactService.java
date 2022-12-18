package com.example.integrationtest.service.admin;


import com.example.integrationtest.dto.member.ContactDTO;
import com.example.integrationtest.repository.admin.AdminContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminContactService {

    @Autowired
    AdminContactRepository acr;

    public ArrayList<ContactDTO> contactList(){
        return acr.contactList();
    }
}
