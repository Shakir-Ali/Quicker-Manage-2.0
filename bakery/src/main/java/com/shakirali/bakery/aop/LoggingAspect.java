package com.shakirali.bakery.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // Logging for AdminService methods

    @Before("execution(* com.shakirali.bakery.service.AdminService.*(..))")
    public void logBeforeAdminMethodExecution(JoinPoint joinPoint) {
        logger.info("Method execution started " + joinPoint.getSignature().getName() + " in AdminService");
    }

    @After("execution(* com.shakirali.bakery.service.AdminService.*(..))")
    public void logAfterAdminMethodExecution(JoinPoint joinPoint) {
        logger.info("Method executed " + joinPoint.getSignature().getName() + " in AdminService");
    }

    @AfterThrowing("execution(* com.shakirali.bakery.service.AdminService.*(..))")
    public void logAfterThrowingAdminMethodExecution(JoinPoint joinPoint) {
        logger.info("Exception Thrown in method " + joinPoint.getSignature().getName() + " in AdminService");
    }

    @AfterReturning("execution(* com.shakirali.bakery.service.AdminService.*(..))")
    public void logAfterReturningAdminMethodExecution(JoinPoint joinPoint) {
        logger.info("Method executed succesfully " + joinPoint.getSignature().getName() + " in AdminService");
    }

    // Logging for SalesService methods
    @Before("execution(* com.shakirali.bakery.service.SalesService.*(..))")
    public void logBeforeSalesMethodExecution(JoinPoint joinPoint) {
        logger.info("Method execution started " + joinPoint.getSignature().getName() + " in SalesService");
    }

    @After("execution(* com.shakirali.bakery.service.SalesService.*(..))")
    public void logAfterSalesMethodExecution(JoinPoint joinPoint) {
        logger.info("Method executed " + joinPoint.getSignature().getName() + " in SalesService");
    }

    @AfterThrowing("execution(* com.shakirali.bakery.service.SalesService.*(..))")
    public void logAfterThrowingSalesMethodExecution(JoinPoint joinPoint) {
        logger.info("Exception Thrown in method " + joinPoint.getSignature().getName() + " in SalesService");
    }

    @AfterReturning("execution(* com.shakirali.bakery.service.SalesService.*(..))")
    public void logAfterReturningSalesMethodExecution(JoinPoint joinPoint) {
        logger.info("Method executed succesfully " + joinPoint.getSignature().getName() + " in SalesService");
    }

    // Logging for CashierService methods
    @Before("execution(* com.shakirali.bakery.service.CashierService.*(..))")
    public void logBeforeCashierMethodExecution(JoinPoint joinPoint) {
        logger.info("Method execution started " + joinPoint.getSignature().getName() + " in CashierService");
    }

    @After("execution(* com.shakirali.bakery.service.CashierService.*(..))")
    public void logAfterCashierMethodExecution(JoinPoint joinPoint) {
        logger.info("Method executed " + joinPoint.getSignature().getName() + " in CashierService");
    }

    @AfterThrowing("execution(* com.shakirali.bakery.service.CashierService.*(..))")
    public void logAfterThrowingCashierMethodExecution(JoinPoint joinPoint) {
        logger.info("Exception Thrown in method " + joinPoint.getSignature().getName() + " in CashierService");
    }

    @AfterReturning("execution(* com.shakirali.bakery.service.CashierService.*(..))")
    public void logAfterReturningCashierMethodExecution(JoinPoint joinPoint) {
        logger.info("Method executed succesfully " + joinPoint.getSignature().getName() + " in CashierService");
    }

    // Logging for ProductService methods

    @Before("execution(* com.shakirali.bakery.service.ProductService.*(..))")
    public void logBeforeProductMethodExecution(JoinPoint joinPoint) {
        logger.info("Method execution started " + joinPoint.getSignature().getName() + " in ProductService");
    }

    @After("execution(* com.shakirali.bakery.service.ProductService.*(..))")
    public void logAfterProductMethodExecution(JoinPoint joinPoint) {
        logger.info("Method executed " + joinPoint.getSignature().getName() + " in ProductService");
    }

    @AfterThrowing("execution(* com.shakirali.bakery.service.ProductService.*(..))")
    public void logAfterThrowingProductMethodExecution(JoinPoint joinPoint) {
        logger.info("Exception Thrown in method " + joinPoint.getSignature().getName() + " in ProductService");
    }

    @AfterReturning("execution(* com.shakirali.bakery.service.ProductService.*(..))")
    public void logAfterReturningProductMethodExecution(JoinPoint joinPoint) {
        logger.info("Method executed succesfully " + joinPoint.getSignature().getName() + " in ProductService");
    }

}
