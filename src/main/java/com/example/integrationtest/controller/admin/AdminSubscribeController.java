package com.example.integrationtest.controller.admin;


import com.example.integrationtest.aop.SkipChecking;
import com.example.integrationtest.dto.member.SubscribeDTO;
import com.example.integrationtest.service.admin.AdminSubscribeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = "거래내역 조회", description = "거래 내역을 조회")
@RestController
public class AdminSubscribeController {

    @Autowired
    AdminSubscribeService asv;
    @SkipChecking
    @GetMapping("/selectSubscribe")
    public ArrayList<SubscribeDTO> subscribeList(){
        return asv.subscribeList();
    }




}
