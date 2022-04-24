package com.thesis.pcbuilder.model;

import javax.persistence.Entity;

@Entity
public class PowerSupply extends Hardware{

    private PowerSupplyType powerSupplyType;
    private int performanceWattage;
    private String efficiency;

    public PowerSupply() {
    }

    public PowerSupply(String name, String manufacturer, long lowestPrice,long averagePrice) {
        super(name, manufacturer, lowestPrice,averagePrice);
    }

    public PowerSupply(String name, String manufacturer, long lowestPrice, long averagePrice, PowerSupplyType powerSupplyType, int performanceWattage, String efficiency) {
        super(name, manufacturer, lowestPrice,averagePrice);
        this.powerSupplyType = powerSupplyType;
        this.performanceWattage = performanceWattage;
        this.efficiency = efficiency;
    }

    public PowerSupplyType getPowerSupplyType() {
        return powerSupplyType;
    }

    public void setPowerSupplyType(PowerSupplyType powerSupplyType) {
        this.powerSupplyType = powerSupplyType;
    }

    public int getPerformanceWattage() {
        return performanceWattage;
    }

    public void setPerformanceWattage(int performanceWattage) {
        this.performanceWattage = performanceWattage;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}

