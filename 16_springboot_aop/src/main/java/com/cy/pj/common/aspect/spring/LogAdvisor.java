package com.cy.pj.common.aspect.spring;

import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;
/**原生aop，Advisor类（顾问）*/
public class LogAdvisor
        extends StaticMethodMatcherPointcutAdvisor {


    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return false;
    }
}
