package com.example.integrationtest.controller.admin;


import com.example.integrationtest.dto.member.PaymentDTO;
import com.example.integrationtest.service.admin.AdminPaymentService;
import com.example.integrationtest.service.member.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdminPaymentController {

    @Autowired
    AdminPaymentService aps;

    @GetMapping("/paymentList")
    public ArrayList<PaymentDTO> paymentList(){
        return aps.paymentList();
    }




}
