package com.thesis.pcbuilder.dto;

import com.thesis.pcbuilder.model.PowerSupplyType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PowerSupplyDTO {
    private Integer id;
    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;
    private PowerSupplyType powerSupplyType;
    private int performanceWattage;
    private String efficiency;
}
