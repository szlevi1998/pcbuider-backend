package com.thesis.pcbuilder.model;

import javax.persistence.*;

@Entity
public class PcCase extends Hardware{

    private String sizeType;
    private String color;
    private boolean hasPSU;
    private int stockFansCount;
    private double size;


    public PcCase(String name, String manufacturer, long lowestPrice,long averagePrice) {
        super(name, manufacturer, lowestPrice,averagePrice);
    }

    public PcCase(String name, String manufacturer, long lowestPrice, long averagePrice, String sizeType, String color, boolean hasPSU, int stockFansCount, double size) {
        super(name, manufacturer, lowestPrice,averagePrice);
        this.sizeType = sizeType;
        this.color = color;
        this.hasPSU = hasPSU;
        this.stockFansCount = stockFansCount;
        this.size = size;
    }

    public PcCase() {
        super();
    }

    public String getSizeType() {
        return sizeType;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasPSU() {
        return hasPSU;
    }

    public void setHasPSU(boolean hasPSU) {
        this.hasPSU = hasPSU;
    }

    public int getStockFansCount() {
        return stockFansCount;
    }

    public void setStockFansCount(int stockFansCount) {
        this.stockFansCount = stockFansCount;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
