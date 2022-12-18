package com.example.integrationtest.controller.admin;

import com.example.integrationtest.dto.member.BuyDTO;
import com.example.integrationtest.service.admin.AdminBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdminBuyController {

    @Autowired
    AdminBuyService abs;

    @GetMapping("/buyList")
    public ArrayList<BuyDTO> buyList() {
        return abs.buyList();
    }



}
