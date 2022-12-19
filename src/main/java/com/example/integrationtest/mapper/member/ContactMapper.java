package com.example.integrationtest.mapper.member;


import com.example.integrationtest.dto.member.ContactDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactMapper {

    public void requestCall(ContactDTO contactDTO);


}
