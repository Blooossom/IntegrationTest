package com.example.integrationtest.mapper.admin;


import com.example.integrationtest.dto.member.PaymentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AdminPaymentMapper {


    public ArrayList<PaymentDTO> paymentList();
}
