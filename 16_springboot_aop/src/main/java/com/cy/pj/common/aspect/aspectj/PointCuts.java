package com.cy.pj.common.aspect.aspectj;

import org.aspectj.lang.annotation.Pointcut;
/**PointCut切入点类*/
public class PointCuts {

    @Pointcut("bean(mailServiceImpl)")
    public void beanServiceImp(){};

    @Pointcut("@annotation(com.cy.pj.common.aspect.aspectj.Point)")
    public void annitation(){};


}
