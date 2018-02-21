package com.nc.starter;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class FillListener implements ApplicationListener<ContextRefreshedEvent> {

    private FillWaterMachineProperties props;

    public FillListener(FillWaterMachineProperties props) {
        this.props = props;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        props.адрес.forEach(s -> System.out.println("наполни водой в"+s));
    }
}
