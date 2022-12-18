package com.example.integrationtest.mapper.member;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface SubscribeMapper {

    public int subscribe(@RequestParam("email") String email);

}
