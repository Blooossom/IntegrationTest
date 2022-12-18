package com.example.integrationtest.service.admin;


import com.example.integrationtest.dto.member.MemberDTO;
import com.example.integrationtest.repository.admin.AdminMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminMemberService {

    @Autowired
    AdminMemberRepository amr;

    public ArrayList<MemberDTO> memberList(){
        return amr.memberList();
    }


}
