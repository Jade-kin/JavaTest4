package com.hand.infra.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

public class PublishSpring implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ContextRefreshedEvent) {
            System.out.println("Context Start");
        } else if (event instanceof ContextClosedEvent) {
            System.out.println("Context stop");
        }
    }
}