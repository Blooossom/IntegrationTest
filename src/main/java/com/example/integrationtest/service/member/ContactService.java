package com.example.integrationtest.service.member;


import com.example.integrationtest.dto.member.ContactDTO;
import com.example.integrationtest.repository.member.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactRepository cr;


    public void requestCall(ContactDTO contactDTO){
        cr.requestCall(contactDTO);
    }



}
