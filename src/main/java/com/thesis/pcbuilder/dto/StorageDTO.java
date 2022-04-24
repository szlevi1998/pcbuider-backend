package com.thesis.pcbuilder.dto;

import com.thesis.pcbuilder.model.StorageType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StorageDTO {
    private Integer id;
    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;
    private StorageType storageType;
    private long capacity;
    private String socket;
}
