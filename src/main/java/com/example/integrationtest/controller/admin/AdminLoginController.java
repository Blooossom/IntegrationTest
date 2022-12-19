package com.example.integrationtest.controller.admin;


import com.example.integrationtest.aop.SkipChecking;
import com.example.integrationtest.dto.admin.AdminLoginDTO;
import com.example.integrationtest.service.admin.AdminLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;


@Api(tags = {"관리자 로그인"}, description = "관리자 로그인 관련 서비스")
@Controller
public class AdminLoginController {
    @Autowired
    AdminLoginService as;

    @SkipChecking
    @PostMapping("/adminLogin")
    @ApiOperation(value = "관리자 로그인 기능", notes = "관리자 기능 이용을 위해 관리자 로그인이 필요함")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "관리자 식별 ID", required = true),
            @ApiImplicitParam(name = "password", value = "관리자 식별 PW", required = true)
    })
    public String adminLogin(AdminLoginDTO adminLoginDTO, @ApiIgnore HttpSession session){
        if (session.getAttribute("id") == null) {
            as.adminLogin(adminLoginDTO);
            session.setAttribute("id", adminLoginDTO.getId());
        }
        return "adminIndex";
    }
}
