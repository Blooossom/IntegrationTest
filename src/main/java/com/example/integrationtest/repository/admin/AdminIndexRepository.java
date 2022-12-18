package com.example.integrationtest.repository.admin;


import com.example.integrationtest.mapper.admin.AdminIndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminIndexRepository {


    @Autowired
    AdminIndexMapper mapper;


    public double amountPayment(){
        return mapper.amountPayment();
    }


    public int cntMember(){
        return mapper.cntMember();
    }

    public int cntBuy(){
        return mapper.cntBuy();
    }

    public int cntContact(){
        return mapper.cntContact();
    }




}
