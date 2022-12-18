package com.example.integrationtest.repository.admin;


import com.example.integrationtest.dto.member.BuyDTO;
import com.example.integrationtest.mapper.admin.AdminBuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AdminBuyRepository {

    @Autowired
    AdminBuyMapper mapper;

    public ArrayList<BuyDTO> buyList(){
        return mapper.buyList();
    }


}
