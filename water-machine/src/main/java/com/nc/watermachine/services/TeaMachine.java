package com.nc.watermachine.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("winter")
public class TeaMachine implements WaterMachine{
    private Integer amount = 0;

    @Override
    public String getGlassOfLiquid(Integer amountOfGlass) {
        if (amount - amountOfGlass >= 0) {
            amount = amount - amountOfGlass;
            return "Ваш чай "+amountOfGlass;
        }
        return "Сорян. Нет чая для тебя";
    }

    @Override
    public Integer getAmountOfGlass() {
        return amount;
    }

    @Override
    public void addGlases(Integer amount) {
        this.amount+=amount;
    }
}
