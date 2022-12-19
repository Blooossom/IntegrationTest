package com.example.integrationtest.page.controller;


import com.example.integrationtest.dto.admin.AdminLoginDTO;
import com.example.integrationtest.service.admin.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @Autowired
    AdminLoginService as;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/goLogin")
    public String login(){
        return "login";
    }

    @GetMapping("/goSignup")
    public String signUp(){
        return "signup";
    }

    @GetMapping("/goAdmin")
    public String adminPage(){
        return "adminLogin";
    }

    @GetMapping("/goMemberList")
    public String MemberList(){
        return "memberList";
    }
    @GetMapping("/goPaymentList")
    public String PaymentList(){
        return "paymentList";
    }
    @GetMapping("/goSubscribeList")
    public String subscribeList(){
        return "subscribeList";
    }
    @GetMapping("/goContactList")
    public String contactList(){
        return "contactList";
    }
    @GetMapping("/goMarket")
    public String goBuy(){
        return "market";
    }
    @GetMapping("/goPay")
    public String goPayment(){
        return "pay";
    }
    @GetMapping("/goHistory")
    public String history(){
        return "history";
    }
    @PostMapping("/adminLogin")
    public String adminLogin(AdminLoginDTO adminLoginDTO, HttpSession session){
        if(session.getAttribute("id") != null){
            return "adminIndex";
        } else {
            as.adminLogin(adminLoginDTO);
            session.setAttribute("id", adminLoginDTO.getId());
            return "adminIndex";
        }
    }
}
