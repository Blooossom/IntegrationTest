package com.example.integrationtest.service.member;


import com.example.integrationtest.repository.member.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class SubscribeService {

    @Autowired
    SubscribeRepository sr;

    public void subscribe(@RequestParam("email") String email){
         sr.subscribe(email);
    }
}
