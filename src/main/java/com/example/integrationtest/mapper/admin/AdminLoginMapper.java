package com.example.integrationtest.mapper.admin;


import com.example.integrationtest.dto.admin.AdminLoginDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminLoginMapper {
    public AdminLoginDTO adminLogin(AdminLoginDTO adminLoginDTO);
}
