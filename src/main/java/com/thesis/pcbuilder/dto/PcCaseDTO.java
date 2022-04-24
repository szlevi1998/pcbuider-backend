package com.thesis.pcbuilder.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PcCaseDTO {
    private Integer id;
    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;
    private String sizeType;
    private String color;
    private boolean hasPSU;
    private int stockFansCount;
    private double size;
}
