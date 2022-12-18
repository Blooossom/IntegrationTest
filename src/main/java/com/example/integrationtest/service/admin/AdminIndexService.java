package com.example.integrationtest.service.admin;


import com.example.integrationtest.repository.admin.AdminIndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminIndexService {

    @Autowired
    AdminIndexRepository air;

    public double amountPayment(){
        return air.amountPayment();
    }

    public int cntMember(){
        return air.cntMember();
    }

    public int cntBuy(){
        return air.cntBuy();
    }

    public int cntContact(){
        return air.cntContact();
    }



}
