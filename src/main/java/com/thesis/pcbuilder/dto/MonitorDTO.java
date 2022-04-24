package com.thesis.pcbuilder.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MonitorDTO {

    private Integer id;
    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;
    private double screenSize;
    private String resolution;
    private String resolutionType;
    private String panelType;
    private int refreshRate;
    private String aspectRatio;
    private int responseTime;
}
