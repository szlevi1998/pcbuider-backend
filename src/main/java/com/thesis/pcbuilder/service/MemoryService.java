package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.domain.dao.MemoryDAO;
import com.thesis.pcbuilder.dto.MemoryDTO;
import com.thesis.pcbuilder.mapper.MemoryMapper;
import com.thesis.pcbuilder.response.MemoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoryService {

    private final MemoryMapper memoryMapper;
    private final MemoryDAO memoryDAO;

    public MemoryService(MemoryMapper memoryMapper, MemoryDAO memoryDAO) {
        this.memoryMapper = memoryMapper;
        this.memoryDAO = memoryDAO;
    }

    public MemoryResponse getAllMemory() {
        List<MemoryDTO> memoryList = memoryDAO.getAll().stream()
                .map(memoryMapper::mapToMemoryDTO)
                .toList();

        return MemoryResponse.builder()
                .memoryDTOList(memoryList)
                .build();
    }

}
