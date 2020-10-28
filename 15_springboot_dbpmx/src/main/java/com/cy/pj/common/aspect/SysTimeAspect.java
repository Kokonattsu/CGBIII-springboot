package com.cy.pj.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SysTimeAspect {

    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            Object result = joinPoint.proceed();
            System.out.println("@Around.");
            return result;

        } catch (Throwable e) {
            throw e;
        }
    }
}
