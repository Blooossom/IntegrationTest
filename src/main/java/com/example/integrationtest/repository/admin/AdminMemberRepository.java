package com.example.integrationtest.repository.admin;


import com.example.integrationtest.dto.member.MemberDTO;
import com.example.integrationtest.mapper.admin.AdminMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AdminMemberRepository {

    @Autowired
    AdminMemberMapper mapper;

    public ArrayList<MemberDTO> memberList(){
       return mapper.memberList();
    }


}
