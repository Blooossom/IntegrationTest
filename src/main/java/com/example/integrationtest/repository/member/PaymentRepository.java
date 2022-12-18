package com.example.integrationtest.repository.member;


import com.example.integrationtest.dto.member.PaymentDTO;
import com.example.integrationtest.mapper.member.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PaymentRepository {

    @Autowired
    PaymentMapper mapper;

    public int buyPoint(PaymentDTO paymentDTO){
        return mapper.buyPoint(paymentDTO);
    }

    public ArrayList<PaymentDTO> pointList(PaymentDTO paymentDTO){
        return mapper.pointList(paymentDTO);
    }




}
