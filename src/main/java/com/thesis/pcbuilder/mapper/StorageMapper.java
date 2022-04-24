package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.dto.StorageDTO;
import com.thesis.pcbuilder.model.Storage;
import org.springframework.stereotype.Component;

@Component
public class StorageMapper {
    public StorageDTO mapToStorageDTO(Storage storage){
        return StorageDTO.builder()
                .id(storage.getId())
                .name(storage.getName())
                .manufacturer(storage.getManufacturer())
                .lowestPrice(storage.getLowestPrice())
                .averagePrice(storage.getAveragePrice())
                .storageType(storage.getStorageType())
                .capacity(storage.getCapacity())
                .socket(storage.getSocket())
                .build();
    }
}
