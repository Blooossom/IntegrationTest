package com.example.integrationtest.service.admin;


import com.example.integrationtest.dto.admin.AdminLoginDTO;
import com.example.integrationtest.repository.admin.AdminLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginService {

    @Autowired
    AdminLoginRepository ar;

    public AdminLoginDTO adminLogin(AdminLoginDTO adminLoginDTO){
        return ar.adminLogin(adminLoginDTO);
    }



}
