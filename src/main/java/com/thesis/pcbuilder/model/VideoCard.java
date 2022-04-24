package com.thesis.pcbuilder.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class VideoCard extends Hardware {
    @Enumerated(EnumType.STRING)
    private VideoCardType videoCardType;
    private String videoChipset;
    private int memorySize;
    private String memoryType;


    public VideoCard() {
    }

    public VideoCard(String name, String manufacturer, long lowestPrice,long averagePrice) {
        super(name, manufacturer, lowestPrice,averagePrice);
    }

    public VideoCardType getVideoCardType() {
        return videoCardType;
    }

    public String getVideoChipset() {
        return videoChipset;
    }

    public void setVideoChipset(String videoChipset) {
        this.videoChipset = videoChipset;
    }


    public void setVideoCardType(VideoCardType videoCardType) {
        this.videoCardType = videoCardType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public String getMemoryType(){
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public VideoCard(String name, String manufacturer, long lowestPrice,long averagePrice, VideoCardType videoCardType,String videoChipset, int memorySize,String memoryType) {
        super(name, manufacturer, lowestPrice,averagePrice);
        this.videoCardType = videoCardType;
        this.videoChipset = videoChipset;
        this.memorySize = memorySize;
        this.memoryType = memoryType;
    }
}

