package com.thesis.pcbuilder.model;

import javax.persistence.Entity;

@Entity
public class Memory extends Hardware{

    private String memoryType;
    private int memorySize;
    private int memoryClock;
    private int memoryLatency;
    private String memoryKit;



    public Memory(String name, String manufacturer, long lowestPrice,long averagePrice) {
        super(name, manufacturer, lowestPrice,averagePrice);
    }

    public Memory(String name, String manufacturer, long lowestPrice,long averagePrice, String memoryType,int memorySize, int memoryClock, int memoryLatency, String memoryKit) {
        super(name, manufacturer, lowestPrice,averagePrice);
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.memoryClock = memoryClock;
        this.memoryLatency = memoryLatency;
        this.memoryKit = memoryKit;
    }

    public Memory() {

    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public int getMemoryClock() {
        return memoryClock;
    }

    public void setMemoryClock(int memoryClock) {
        this.memoryClock = memoryClock;
    }

    public int getMemoryLatency() {
        return memoryLatency;
    }

    public void setMemoryLatency(int memoryLatency) {
        this.memoryLatency = memoryLatency;
    }

    public String getMemoryKit() {
        return memoryKit;
    }

    public void setMemoryKit(String memoryKit) {
        this.memoryKit = memoryKit;
    }
}
