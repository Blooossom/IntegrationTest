package com.example.integrationtest.repository.member;

import com.example.integrationtest.dto.member.BuyDTO;
import com.example.integrationtest.mapper.member.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BuyRepository {


    @Autowired
    BuyMapper mapper;


    public int buyCoin(BuyDTO buyDTO){
        return mapper.buyCoin(buyDTO);
    }


    public double checkBalance(String total){
        return mapper.checkBalance(total);
    }




}
