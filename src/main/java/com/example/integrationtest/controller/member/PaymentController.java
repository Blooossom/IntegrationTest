package com.example.integrationtest.controller.member;

import com.example.integrationtest.dto.member.PaymentDTO;
import com.example.integrationtest.service.member.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class PaymentController {


    @Autowired
    PaymentService ps;

    @GetMapping("/point")
    public String buyPoint(HttpSession session, PaymentDTO paymentDTO){
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            paymentDTO.setEmail(email);
            ps.buyPoint(paymentDTO);
        } else {
            return "실패";
        }
        return  "충전 성공";
    }

    @GetMapping("/pointList")
    public String pointList(HttpSession session, PaymentDTO paymentDTO){
        if(session.getAttribute("email") != null){
            String email = String.valueOf(session.getAttribute("email"));
            paymentDTO.setEmail(email);
            ps.pointList(paymentDTO);
        } else {
            return "login";
        }
        return "history";
    }
}
