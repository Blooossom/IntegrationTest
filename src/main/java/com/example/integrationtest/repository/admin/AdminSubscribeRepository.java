package com.example.integrationtest.repository.admin;


import com.example.integrationtest.dto.member.SubscribeDTO;
import com.example.integrationtest.mapper.admin.AdminSubscribeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AdminSubscribeRepository {

    @Autowired
    AdminSubscribeMapper mapper;

    public ArrayList<SubscribeDTO> subscribeList(){
        return mapper.subscribeList();
    }



}
