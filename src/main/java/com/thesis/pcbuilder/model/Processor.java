package com.thesis.pcbuilder.model;

import javax.persistence.Entity;

@Entity
public class Processor extends Hardware {

    private String socket;
    private boolean igp;
    private int coreCount;
    private int threadCount;
    private double coreClock;

    public Processor() {
    }

    public Processor(String name, String manufacturer, long lowestPrice,long averagePrice) {
        super(name, manufacturer, lowestPrice,averagePrice);
    }

    public Processor(String name, String manufacturer, long lowestPrice, long averagePrice, String socket, boolean igp, int coreCount, int threadCount, double coreClock) {
        super(name, manufacturer, lowestPrice,averagePrice);
        this.socket = socket;
        this.igp = igp;
        this.coreCount = coreCount;
        this.threadCount = threadCount;
        this.coreClock = coreClock;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public boolean isIgp() {
        return igp;
    }

    public void setIgp(boolean igp) {
        this.igp = igp;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public int getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(int threadCount) {
        this.threadCount = threadCount;
    }

    public double getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(double coreClock) {
        this.coreClock = coreClock;
    }
}
