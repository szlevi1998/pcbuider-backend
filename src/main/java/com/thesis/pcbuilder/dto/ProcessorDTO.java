package com.thesis.pcbuilder.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProcessorDTO {
    private Integer id;
    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;
    private String socket;
    private boolean igp;
    private int coreCount;
    private int threadCount;
    private double coreClock;
}
