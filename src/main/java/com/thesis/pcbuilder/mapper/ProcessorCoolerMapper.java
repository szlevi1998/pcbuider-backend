package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.dto.ProcessorCoolerDTO;
import com.thesis.pcbuilder.model.ProcessorCooler;
import org.springframework.stereotype.Component;

@Component
public class ProcessorCoolerMapper {
    public ProcessorCoolerDTO mapToProcessorCoolerDTO(ProcessorCooler processorCooler){
        return ProcessorCoolerDTO.builder()
                .id(processorCooler.getId())
                .name(processorCooler.getName())
                .manufacturer(processorCooler.getManufacturer())
                .lowestPrice(processorCooler.getLowestPrice())
                .averagePrice(processorCooler.getAveragePrice())
                .cpuCoolingType(processorCooler.getCpuCoolingType())
                .maxRPM(processorCooler.getMaxRPM())
                .build();
    }
}
