package com.example.integrationtest.controller.admin;


import com.example.integrationtest.dto.member.MemberDTO;
import com.example.integrationtest.service.admin.AdminMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@Api(tags = "회원목록 조회", description = "회원목록 조회 서비스")
@RestController
public class AdminMemberController {

    @Autowired
    AdminMemberService ams;

    @ApiOperation(value = "회원 목록 조회", notes = "가입한 회원 목록을 조회합니다.")
    @GetMapping("/selectMember")
    public ArrayList<MemberDTO> memberList(){
        return ams.memberList();
    }

}
