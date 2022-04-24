package com.thesis.pcbuilder.dto;

import com.thesis.pcbuilder.model.ProcessorCoolingType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProcessorCoolerDTO {
    private Integer id;
    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;
    private ProcessorCoolingType cpuCoolingType;
    private int maxRPM;
}
