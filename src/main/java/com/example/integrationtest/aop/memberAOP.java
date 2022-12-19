package com.example.integrationtest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
@Aspect
public class memberAOP {

    @Pointcut(" execution(* com.example.integrationtest.controller.member.*.*(..))")
    public void memberCut(){}

    @Around("memberCut() && !@annotation(com.example.integrationtest.aop.SkipChecking)")
    public Object around(ProceedingJoinPoint joinPoint)throws Throwable{
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
        if (session.getAttribute("email") == null) {
            return null;
        } else {
            return joinPoint.proceed();
        }
    }

}
