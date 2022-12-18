package com.example.integrationtest.service.admin;


import com.example.integrationtest.dto.member.SubscribeDTO;
import com.example.integrationtest.repository.admin.AdminSubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminSubscribeService {

    @Autowired
    AdminSubscribeRepository asr;

    public ArrayList<SubscribeDTO> subscribeList(){
        return asr.subscribeList();
    }



}
