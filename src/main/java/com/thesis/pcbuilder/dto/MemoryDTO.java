package com.thesis.pcbuilder.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MemoryDTO {

    private Integer id;
    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;
    private String memoryType;
    private int memorySize;
    private int memoryClock;
    private int memoryLatency;
    private String memoryKit;

}
