package com.thesis.pcbuilder.model;

import javax.persistence.Entity;

@Entity
public class ProcessorCooler extends Hardware {


    private ProcessorCoolingType cpuCoolingType;
    private int maxRPM;

    public ProcessorCooler(String name, String manufacturer, long lowestPrice,long averagePrice) {
        super(name, manufacturer, lowestPrice,averagePrice);
    }

    public ProcessorCooler(String name, String manufacturer, long lowestPrice,long averagePrice, ProcessorCoolingType cpuCoolingType, int maxRPM) {
        super(name, manufacturer, lowestPrice,averagePrice);
        this.cpuCoolingType = cpuCoolingType;
        this.maxRPM = maxRPM;
    }

    public ProcessorCooler() {

    }

    public ProcessorCoolingType getCpuCoolingType() {
        return cpuCoolingType;
    }

    public void setCpuCoolingType(ProcessorCoolingType cpuCoolingType) {
        this.cpuCoolingType = cpuCoolingType;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }
}
