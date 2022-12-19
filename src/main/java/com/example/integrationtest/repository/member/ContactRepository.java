package com.example.integrationtest.repository.member;


import com.example.integrationtest.dto.member.ContactDTO;
import com.example.integrationtest.mapper.member.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper mapper;

    public void requestCall(ContactDTO contactDTO){mapper.requestCall(contactDTO);
    }

}
