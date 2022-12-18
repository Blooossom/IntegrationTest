package com.example.integrationtest.mapper.admin;


import com.example.integrationtest.dto.member.SubscribeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AdminSubscribeMapper {


    public ArrayList<SubscribeDTO> subscribeList();


}
