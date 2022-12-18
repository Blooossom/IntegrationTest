package com.example.integrationtest.repository.admin;


import com.example.integrationtest.dto.admin.AdminLoginDTO;
import com.example.integrationtest.mapper.admin.AdminLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminLoginRepository {

    @Autowired
    AdminLoginMapper mapper;


    public AdminLoginDTO login(AdminLoginDTO adminLoginDTO){
        return mapper.login(adminLoginDTO);
    }



}
