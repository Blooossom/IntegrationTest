package com.example.integrationtest.controller.admin;


import com.example.integrationtest.aop.SkipChecking;
import com.example.integrationtest.dto.member.ContactDTO;
import com.example.integrationtest.service.admin.AdminContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = "연락 요청 목록", description = "연락 요쳥 목록 조회")
@RestController
public class AdminContactController {

    @Autowired
    AdminContactService acs;
    @SkipChecking
    @ApiOperation(value = "연락 요청 회원 조회", notes = "현재까지 연락을 요청한 회원 목록을 조회합니다.")
    @GetMapping("/selectContact")
    public ArrayList<ContactDTO> contactList(){
        return acs.contactList();
    }



}
