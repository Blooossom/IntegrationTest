package com.example.integrationtest.controller.admin;

import com.example.integrationtest.dto.admin.AdminLoginDTO;
import com.example.integrationtest.service.admin.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminLoginController {

    @Autowired
    AdminLoginService as;


    @PostMapping("/adminLogin")
    public String login(AdminLoginDTO adminLoginDTO, HttpSession session){
        if(session.getAttribute("id") != null){
            return "adminIndex";
        } else {
            as.login(adminLoginDTO);
            session.setAttribute("id", adminLoginDTO.getId());
            return "adminIndex";
        }
    }




}
