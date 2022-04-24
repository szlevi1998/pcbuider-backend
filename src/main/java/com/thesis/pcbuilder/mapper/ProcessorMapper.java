package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.dto.ProcessorDTO;
import com.thesis.pcbuilder.model.Processor;
import org.springframework.stereotype.Component;

@Component
public class ProcessorMapper {
    public ProcessorDTO mapToProcessorDTO(Processor processor){
        return ProcessorDTO.builder()
                .id(processor.getId())
                .name(processor.getName())
                .manufacturer(processor.getManufacturer())
                .lowestPrice(processor.getLowestPrice())
                .averagePrice(processor.getAveragePrice())
                .socket(processor.getSocket())
                .igp(processor.isIgp())
                .coreCount(processor.getCoreCount())
                .threadCount(processor.getThreadCount())
                .coreClock(processor.getCoreClock())
                .build();
    }
}
