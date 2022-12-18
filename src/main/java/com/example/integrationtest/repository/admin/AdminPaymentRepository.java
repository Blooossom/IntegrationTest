package com.example.integrationtest.repository.admin;


import com.example.integrationtest.dto.member.PaymentDTO;
import com.example.integrationtest.mapper.admin.AdminPaymentMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AdminPaymentRepository {

    @Autowired
    AdminPaymentMapper mapper;

    public ArrayList<PaymentDTO> paymentList(){
        return mapper.paymentList();
    }



}
