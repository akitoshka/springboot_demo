package com.nc.watermachine.controllers;

import com.nc.watermachine.services.WaterMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/water")
@Controller
public class ControllerOfWaterMachine {

    @Autowired
    WaterMachine waterMachine;

    @ResponseBody
    @RequestMapping(value = "/{count}", method = RequestMethod.GET)
    String giveWater(@PathVariable Integer count ) {
        return waterMachine.getGlassOfLiquid(count);
    }

    @ResponseBody
    @RequestMapping(value = "/t", method = RequestMethod.GET)
    String giveWater(@RequestParam String p1, @RequestParam String sd) {
        return p1+" "+sd;
    }

    @RequestMapping(value = "/{count}", method = RequestMethod.PUT)
    @ResponseBody
    String fillWater(@PathVariable Integer count){
        waterMachine.addGlases(count);
        return "Добавили "+count;
    }

    @RequestMapping(value = "/state")
    @ResponseBody
    String getState(){
        return waterMachine.getAmountOfGlass()+"";
    }

}
