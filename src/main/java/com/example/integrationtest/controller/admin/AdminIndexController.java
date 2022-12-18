package com.example.integrationtest.controller.admin;


import com.example.integrationtest.service.admin.AdminIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminIndexController {

    @Autowired
    AdminIndexService ais;

    @GetMapping("/selectAmountPayment")
    public double amountPayment(){
        return ais.amountPayment();
    }
    @GetMapping("/selectCntMember")
    public int cntMember(){
        return ais.cntMember();
    }

    @GetMapping("/selectCntBuy")
    public int cntBuy(){
        return ais.cntBuy();
    }

    @GetMapping("/selectCntContact")
    public int cntContact(){
        return ais.cntContact();
    }





}
