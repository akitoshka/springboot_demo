package com.nc.starter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class ProfileCheckerContextInializer implements ApplicationContextInitializer{
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        if(configurableApplicationContext.getEnvironment().getActiveProfiles().length == 0) {
            throw new RuntimeException("Проставь профайл!");
        }
    }
}
