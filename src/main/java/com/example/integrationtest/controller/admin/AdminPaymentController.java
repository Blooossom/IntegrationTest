package com.example.integrationtest.controller.admin;


import com.example.integrationtest.dto.member.PaymentDTO;
import com.example.integrationtest.service.admin.AdminPaymentService;
import com.example.integrationtest.service.member.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = "결제내역 조회", description = "결제 내역을 조회")
@RestController
public class AdminPaymentController {

    @Autowired
    AdminPaymentService aps;

    @ApiOperation(value = "결제 내역 조회", notes = "현재까지의 결제 내역을 조회합니다.")
    @GetMapping("/selectPayment")
    public ArrayList<PaymentDTO> paymentList(){
        return aps.paymentList();
    }




}
