package com.example.integrationtest.mapper.admin;


import com.example.integrationtest.dto.member.ContactDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AdminContactMapper {



    public ArrayList<ContactDTO> contactList();



}
