package com.thesis.pcbuilder.dto;

import com.thesis.pcbuilder.model.VideoCardType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class VideoCardDTO {
    private Integer id;
    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;
    private VideoCardType videoCardType;
    private String videoChipset;
    private int memorySize;
    private String memoryType;
}
