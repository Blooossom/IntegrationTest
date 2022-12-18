package com.example.integrationtest.repository.member;


import com.example.integrationtest.mapper.member.SubscribeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class SubscribeRepository {

    @Autowired
    SubscribeMapper mapper;

    public int subscribe(@RequestParam("email") String email){
        return mapper.subscribe(email);
    }

}
