package com.nc.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class FillWaterMachineEnvPP implements EnvironmentPostProcessor{
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (System.getenv().get("profile") == null) {
            environment.setActiveProfiles("winter");
        } else {
//            environment.addActiveProfile("summer");
        }
    }
}
