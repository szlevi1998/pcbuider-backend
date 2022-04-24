package com.thesis.pcbuilder.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MotherboardDTO {
    private Integer id;
    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;
    private String size;
    private String socket;
    private String chipset;
    private String memoryType;
    private int memorySlots;
    private boolean hasBluetooth;
    private boolean hasWifi;
}
