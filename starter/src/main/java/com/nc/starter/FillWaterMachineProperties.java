package com.nc.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("наполнить")
public class FillWaterMachineProperties {
    List<String> адрес;
}
