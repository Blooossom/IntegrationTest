package com.example.integrationtest.service.member;


import com.example.integrationtest.dto.member.BuyDTO;
import com.example.integrationtest.repository.member.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyService {



    @Autowired
    BuyRepository br;

    public int buyCoin(BuyDTO buyDTO){
        return br.buyCoin(buyDTO);
    }

    public double checkBalance(String total){
        return br.checkBalance(total);
    }

}
