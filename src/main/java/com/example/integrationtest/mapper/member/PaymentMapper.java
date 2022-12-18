package com.example.integrationtest.mapper.member;

import com.example.integrationtest.dto.member.PaymentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PaymentMapper {

    public int buyPoint(PaymentDTO paymentDTO);
    public ArrayList<PaymentDTO> pointList(PaymentDTO paymentDTO);

}
