package com.example.integrationtest.controller.member;


import com.example.integrationtest.dto.member.MemberDTO;
import com.example.integrationtest.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {

    @Autowired
    MemberService ms;

    @PostMapping("/login")
    public String login(MemberDTO memberDTO, HttpSession session){
        if (session.getAttribute("email") != null) {
            return "index";
        } else {
            ms.login(memberDTO);
            session.setAttribute("email", memberDTO.getEmail());
            return "index";
        }
    }
    @PostMapping("/signup")
    public String signUp(MemberDTO memberDTO){
        ms.signUp(memberDTO);
        return "login";
    }





}
