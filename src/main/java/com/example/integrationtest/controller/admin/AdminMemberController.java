package com.example.integrationtest.controller.admin;


import com.example.integrationtest.dto.member.MemberDTO;
import com.example.integrationtest.service.admin.AdminMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdminMemberController {

    @Autowired
    AdminMemberService ams;

    @PostMapping("/memberList")
    public ArrayList<MemberDTO> memberList(){
        return ams.memberList();
    }

}
