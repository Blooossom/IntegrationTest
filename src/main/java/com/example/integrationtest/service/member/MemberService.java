package com.example.integrationtest.service.member;


import com.example.integrationtest.dto.member.MemberDTO;
import com.example.integrationtest.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {


    @Autowired
    MemberRepository mr;

    public int signUp(MemberDTO memberDTO){
        return mr.signUp(memberDTO);
    }

    public MemberDTO login(MemberDTO memberDTO){
        return mr.login(memberDTO);
    }
}
