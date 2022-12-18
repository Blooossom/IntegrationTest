package com.example.integrationtest.mapper.member;

import com.example.integrationtest.dto.member.BuyDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuyMapper {


    public int buyCoin(BuyDTO buyDTO);

    public double checkBalance(String total);
}
