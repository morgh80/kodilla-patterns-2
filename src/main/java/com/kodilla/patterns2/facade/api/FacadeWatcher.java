package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(com.kodilla.patterns2.facade.api.FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"
    + "&&  args(orderDto, userId) && target(object)")
    public void logProcess(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + "; Arguments: " + orderDto.getItems() + ", UserId: " + userId);
    }
}
