package com.example.integrationtest.mapper.member;


import com.example.integrationtest.dto.member.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public int signUp(MemberDTO memberDTO);
    public MemberDTO login(MemberDTO memberDTO);


}
