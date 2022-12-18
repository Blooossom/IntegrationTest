package com.example.integrationtest.service.admin;


import com.example.integrationtest.dto.member.BuyDTO;
import com.example.integrationtest.repository.admin.AdminBuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminBuyService {



    @Autowired
    AdminBuyRepository abr;

    public ArrayList<BuyDTO> buyList(){
        return abr.buyList();
    }
}
