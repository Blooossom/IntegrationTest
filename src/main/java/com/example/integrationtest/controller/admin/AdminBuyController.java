package com.example.integrationtest.controller.admin;

import com.example.integrationtest.dto.member.BuyDTO;
import com.example.integrationtest.service.admin.AdminBuyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = "거래내역 조회", description = "거래 내역을 조회")
@RestController
public class AdminBuyController {

    @Autowired
    AdminBuyService abs;

    @ApiOperation(value = "거래 내역 조회", notes = "현재까지의 거래 내역을 조회합니다.")
    @GetMapping("selectBuy")
    public ArrayList<BuyDTO> buyList() {
        return abs.buyList();
    }



}
