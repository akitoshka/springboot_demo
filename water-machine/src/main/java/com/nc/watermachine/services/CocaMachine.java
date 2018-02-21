package com.nc.watermachine.services;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("summer")
@ConditionalOnProperty("is-coca")
public class CocaMachine implements WaterMachine{
    private Integer amount = 0;

    @Override
    public String getGlassOfLiquid(Integer amountOfGlass) {
        if (amount - amountOfGlass >= 0) {
            amount = amount - amountOfGlass;
            return "Ваша Кола "+amountOfGlass;
        }
        return "Сорян. Нет колы для тебя";
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
