package com.example.integrationtest.repository.admin;


import com.example.integrationtest.dto.member.ContactDTO;
import com.example.integrationtest.mapper.admin.AdminContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AdminContactRepository {

    @Autowired
    AdminContactMapper mapper;

    public ArrayList<ContactDTO> contactList(){
        return mapper.contactList();
    }




}
