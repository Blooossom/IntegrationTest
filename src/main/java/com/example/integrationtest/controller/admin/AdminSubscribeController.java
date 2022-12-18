package com.example.integrationtest.controller.admin;


import com.example.integrationtest.dto.member.SubscribeDTO;
import com.example.integrationtest.service.admin.AdminSubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdminSubscribeController {

    @Autowired
    AdminSubscribeService asv;

    @GetMapping("/subscribeList")
    public ArrayList<SubscribeDTO> subscribeList(){
        return asv.subscribeList();
    }




}
