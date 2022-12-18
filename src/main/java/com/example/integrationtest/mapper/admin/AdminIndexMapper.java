package com.example.integrationtest.mapper.admin;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminIndexMapper {


    public double amountPayment();

    public int cntMember();

    public int cntBuy();

    public int cntContact();




}
