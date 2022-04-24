package com.thesis.pcbuilder.model;

import javax.persistence.Entity;

@Entity
public class Monitor extends Hardware{

    private double screenSize;
    private String resolution;
    private String resolutionType;
    private String panelType;
    private int refreshRate;
    private String aspectRatio;
    private int responseTime;

    public Monitor(String name, String manufacturer, long lowestPrice,long averagePrice) {
        super(name, manufacturer, lowestPrice,averagePrice);
    }

    public Monitor(String name, String manufacturer, long lowestPrice,long averagePrice, double screenSize, String resolution, String resolutionType, String panelType, int refreshRate, String aspectRatio, int responseTime) {
        super(name, manufacturer, lowestPrice,averagePrice);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.resolutionType = resolutionType;
        this.panelType = panelType;
        this.refreshRate = refreshRate;
        this.aspectRatio = aspectRatio;
        this.responseTime = responseTime;
    }

    public Monitor() {

    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(String resolutionType) {
        this.resolutionType = resolutionType;
    }

    public String getPanelType() {
        return panelType;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }
}


