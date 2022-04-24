package com.thesis.pcbuilder.model;

import javax.persistence.Entity;

@Entity
public class Motherboard extends Hardware {

    private String size;
    private String socket;
    private String chipset;
    private String memoryType;
    private int memorySlots;
    private boolean hasBluetooth;
    private boolean hasWifi;

    public Motherboard(String name, String manufacturer, long lowestPrice,long averagePrice) {
        super(name, manufacturer, lowestPrice,averagePrice);
    }

    public Motherboard(String name, String manufacturer, long lowestPrice, long averagePrice,String size, String socket, String chipset, String memoryType, int memorySlots, boolean hasBluetooth, boolean hasWifi) {
        super(name, manufacturer, lowestPrice,averagePrice);
        this.size = size;
        this.socket = socket;
        this.chipset = chipset;
        this.memoryType = memoryType;
        this.memorySlots = memorySlots;
        this.hasBluetooth = hasBluetooth;
        this.hasWifi = hasWifi;
    }

    public Motherboard() {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public int getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

}
