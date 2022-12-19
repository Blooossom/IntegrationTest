package com.example.integrationtest.controller.admin;


import com.example.integrationtest.service.admin.AdminIndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"관리자 서비스 요약"}, description = "관리자 관련 서비스")
@RestController
public class AdminIndexController {

    @Autowired
    AdminIndexService ais;


    @ApiOperation(value = "총 포인트 판매량", notes = "총 포인트 판매량을 조회한다")
    @GetMapping("/selectAmountPayment")
    public double amountPayment(){
        return ais.amountPayment();
    }
    @ApiOperation(value = "멤버 수 조회", notes = "현재 DB에 등록된 멤버의 수를 조회합니다.")
    @GetMapping("/selectCntMember")
    public int cntMember(){
        return ais.cntMember();
    }
    @ApiOperation(value = "구매 횟수 조회", notes = "지금까지의 거래 횟수를 조회합니다.")
    @GetMapping("/selectCntBuy")
    public int cntBuy(){
        return ais.cntBuy();
    }
    @ApiOperation(value = "연락 횟수 조회", notes = "연락을 요청한 회원의 수를 조회합니다.")
    @GetMapping("/selectCntContact")
    public int cntContact(){
        return ais.cntContact();
    }





}
