package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.domain.dao.ProcessorDAO;
import com.thesis.pcbuilder.dto.ProcessorDTO;
import com.thesis.pcbuilder.mapper.ProcessorMapper;
import com.thesis.pcbuilder.response.ProcessorResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessorService {
    private final ProcessorDAO processorDAO;
    private final ProcessorMapper processorMapper;

    public ProcessorService(ProcessorDAO processorDAO, ProcessorMapper processorMapper) {
        this.processorDAO = processorDAO;
        this.processorMapper = processorMapper;
    }
    public ProcessorResponse getAllProcessor(){
        List<ProcessorDTO> processorList = processorDAO.getAll().stream()
                .map(processorMapper::mapToProcessorDTO)
                .toList();
        return ProcessorResponse.builder()
                .processorDTOList(processorList)
                .build();
    }
}
