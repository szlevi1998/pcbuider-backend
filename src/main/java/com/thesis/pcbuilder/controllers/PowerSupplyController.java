package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.response.PowerSupplyResponse;
import com.thesis.pcbuilder.service.PowerSupplyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pcbuilder/powersupplies")
public class PowerSupplyController {

    private final PowerSupplyService powerSupplyService;

    public PowerSupplyController(PowerSupplyService powerSupplyService) {
        this.powerSupplyService = powerSupplyService;
    }

    @GetMapping
    public PowerSupplyResponse getAllPowerSupply() {
        return powerSupplyService.getAllPowerSupply();
    }

}
