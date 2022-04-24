package com.thesis.pcbuilder.model;

import javax.persistence.Entity;

@Entity
public class Storage extends Hardware {

    private StorageType storageType;
    private long capacity;
    private String socket;

    public Storage() {
    }

    public Storage(String name, String manufacturer, long lowestPrice,long averagePrice) {
        super(name, manufacturer, lowestPrice,averagePrice);
    }

    public Storage(String name, String manufacturer, long lowestPrice,long averagePrice, StorageType storageType, long capacity, String socket) {
        super(name, manufacturer, lowestPrice,averagePrice);
        this.storageType = storageType;
        this.capacity = capacity;
        this.socket = socket;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageType storageType) {
        this.storageType = storageType;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
