package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.dto.PcCaseDTO;
import com.thesis.pcbuilder.model.PcCase;
import org.springframework.stereotype.Component;

@Component
public class PcCaseMapper {

    public PcCaseDTO mapToPcCaseDTO(PcCase pcCase){
        return PcCaseDTO.builder()
                .id(pcCase.getId())
                .name(pcCase.getName())
                .manufacturer(pcCase.getManufacturer())
                .lowestPrice(pcCase.getLowestPrice())
                .averagePrice(pcCase.getAveragePrice())
                .sizeType(pcCase.getSizeType())
                .color(pcCase.getColor())
                .hasPSU(pcCase.isHasPSU())
                .stockFansCount(pcCase.getStockFansCount())
                .size(pcCase.getSize())
                .build();
    }
}
