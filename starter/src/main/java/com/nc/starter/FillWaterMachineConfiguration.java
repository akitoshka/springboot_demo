package com.nc.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(FillWaterMachineProperties.class)
public class FillWaterMachineConfiguration {

    @Bean
    @Autowired
    public FillListener fillListener(FillWaterMachineProperties props) {
        return new FillListener(props);
    }

}
