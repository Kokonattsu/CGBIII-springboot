package com.cy.pj.common.aspect.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/**原生aop，Advice类（通知）*/
public class LogAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        long t1=System.nanoTime();
        Object result = invocation.proceed();
        long t2=System.nanoTime();
        System.out.println("runtime=>"+(t2-t1));
        return result;
    }
}
