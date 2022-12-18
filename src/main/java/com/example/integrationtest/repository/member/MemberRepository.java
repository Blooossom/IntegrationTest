package com.example.integrationtest.repository.member;


import com.example.integrationtest.dto.member.MemberDTO;
import com.example.integrationtest.mapper.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;

    public int signUp(MemberDTO memberDTO){
        return mapper.signUp(memberDTO);
    }

    public MemberDTO login(MemberDTO memberDTO){
        return mapper.login(memberDTO);
    }
}
