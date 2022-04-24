package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.dto.MemoryDTO;
import com.thesis.pcbuilder.model.Memory;
import org.springframework.stereotype.Component;

@Component
public class MemoryMapper {


    public MemoryDTO mapToMemoryDTO(Memory memory) {

        return MemoryDTO.builder()
                .id(memory.getId())
                .name(memory.getName())
                .manufacturer(memory.getManufacturer())
                .lowestPrice(memory.getLowestPrice())
                .averagePrice(memory.getAveragePrice())
                .memoryType(memory.getMemoryType())
                .memorySize(memory.getMemorySize())
                .memoryClock(memory.getMemoryClock())
                .memoryLatency(memory.getMemoryLatency())
                .memoryKit(memory.getMemoryKit())
                .build();
    }

}
