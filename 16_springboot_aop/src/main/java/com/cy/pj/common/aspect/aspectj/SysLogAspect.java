package com.cy.pj.common.aspect.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**AspectJ框架的切面类*/
@Aspect
@Component
public class SysLogAspect {

    Map<String,Object> cache=new ConcurrentHashMap<>();


    @Around("com.cy.pj.common.aspect.aspectj.PointCuts.beanServiceImp()")
    public Object doAround(ProceedingJoinPoint joinPoint)throws Throwable{
        long t1=System.nanoTime();
        Object proceed = joinPoint.proceed();
        long t2=System.nanoTime();
        System.out.println("sysLogAspect=>"+(t2-t1));
        return proceed;
    }

    @Around("com.cy.pj.common.aspect.aspectj.PointCuts.annitation()")
    public Object doAroundAnnotation(
            ProceedingJoinPoint joinPoint) throws Throwable {
        Object userData = cache.get("userData");
        if (userData!=null){

            return userData;
        }else {
          Object result = joinPoint.proceed();
          cache.put("userData", result);
          return result;
        }

    }


}
