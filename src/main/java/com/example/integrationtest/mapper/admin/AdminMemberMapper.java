package com.example.integrationtest.mapper.admin;


import com.example.integrationtest.dto.member.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AdminMemberMapper {




    public ArrayList<MemberDTO> memberList();
}
