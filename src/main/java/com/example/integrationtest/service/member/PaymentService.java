package com.example.integrationtest.service.member;


import com.example.integrationtest.dto.member.PaymentDTO;
import com.example.integrationtest.repository.member.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository pr;

    public int buyPoint(PaymentDTO paymentDTO){
        return pr.buyPoint(paymentDTO);
    }

    public ArrayList<PaymentDTO> pointList(PaymentDTO paymentDTO){
        return pr.pointList(paymentDTO);
    }
}
