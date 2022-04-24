package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.domain.dao.ProcessorCoolerDAO;
import com.thesis.pcbuilder.dto.ProcessorCoolerDTO;
import com.thesis.pcbuilder.mapper.ProcessorCoolerMapper;
import com.thesis.pcbuilder.response.ProcessorCoolerResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessorCoolerService {
    private final ProcessorCoolerDAO processorCoolerDAO;
    private final ProcessorCoolerMapper processorCoolerMapper;

    public ProcessorCoolerService(ProcessorCoolerDAO processorCoolerDAO, ProcessorCoolerMapper processorCoolerMapper) {
        this.processorCoolerDAO = processorCoolerDAO;
        this.processorCoolerMapper = processorCoolerMapper;
    }
    public ProcessorCoolerResponse getAllProcessorCooler(){
        List<ProcessorCoolerDTO> processorCoolerList = processorCoolerDAO.getAll().stream()
                .map(processorCoolerMapper::mapToProcessorCoolerDTO)
                .toList();
        return ProcessorCoolerResponse.builder()
                .processorCoolerDTOList(processorCoolerList)
                .build();
    }
}
