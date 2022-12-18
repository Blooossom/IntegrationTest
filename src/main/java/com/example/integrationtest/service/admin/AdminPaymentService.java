package com.example.integrationtest.service.admin;


import com.example.integrationtest.dto.member.PaymentDTO;
import com.example.integrationtest.repository.admin.AdminPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminPaymentService {

    @Autowired
    AdminPaymentRepository apr;

    public ArrayList<PaymentDTO> paymentList(){
        return apr.paymentList();
    }
}
