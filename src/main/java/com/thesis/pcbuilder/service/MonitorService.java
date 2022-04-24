package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.domain.dao.MonitorDAO;
import com.thesis.pcbuilder.dto.MonitorDTO;
import com.thesis.pcbuilder.mapper.MonitorMapper;
import com.thesis.pcbuilder.response.MonitorResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {
    
    private final MonitorMapper monitorMapper;
    private final MonitorDAO monitorDAO;

    public MonitorService(MonitorMapper monitorMapper, MonitorDAO monitorDAO) {
        this.monitorMapper = monitorMapper;
        this.monitorDAO = monitorDAO;
    }


    public MonitorResponse getAllMonitor() {
        List<MonitorDTO> monitorList = monitorDAO.getAll().stream()
                .map(monitorMapper::mapToMonitorDTO)
                .toList();

        return MonitorResponse.builder()
                .monitorDTOList(monitorList)
                .build();
    }
    
}
