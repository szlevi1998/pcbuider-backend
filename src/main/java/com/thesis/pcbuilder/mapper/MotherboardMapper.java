package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.dto.MotherboardDTO;
import com.thesis.pcbuilder.model.Motherboard;
import org.springframework.stereotype.Component;

@Component
public class MotherboardMapper {

    public MotherboardDTO mapToMotherboardDTO(Motherboard motherboard){
        return MotherboardDTO.builder()
                .id(motherboard.getId())
                .name(motherboard.getName())
                .manufacturer(motherboard.getManufacturer())
                .lowestPrice(motherboard.getLowestPrice())
                .averagePrice(motherboard.getAveragePrice())
                .size(motherboard.getSize())
                .socket(motherboard.getSocket())
                .chipset(motherboard.getChipset())
                .memoryType(motherboard.getMemoryType())
                .memorySlots(motherboard.getMemorySlots())
                .hasBluetooth(motherboard.isHasBluetooth())
                .hasWifi(motherboard.isHasWifi())
                .build();
    }

}
