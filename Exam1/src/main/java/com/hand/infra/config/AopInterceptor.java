package com.hand.infra.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AopInterceptor {

    private final Logger logger = LoggerFactory.getLogger(AopInterceptor.class);

    @Before(value = "execution(* com.hand.api.service.impl..*.*(..))")
    public void BeforeInsertFilmEvent(){

        System.out.println("Before Insert Film Data!");
        logger.info("Before Insert Film Data!");

    }

    @After(value = "execution(* com.hand.api.service.impl..*.*(..))")
    public void AfterInsertFilmEvent(){


        System.out.println("After Insert Film Data!");
        logger.info("After Insert Film Data!");

    }

}