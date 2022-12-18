package com.example.integrationtest.mapper.admin;


import com.example.integrationtest.dto.member.BuyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AdminBuyMapper {


    public ArrayList<BuyDTO> buyList();




}
