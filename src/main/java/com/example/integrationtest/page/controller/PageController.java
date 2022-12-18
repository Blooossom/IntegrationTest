package com.example.integrationtest.page.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {


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

}
