package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.dto.MonitorDTO;
import com.thesis.pcbuilder.model.Monitor;
import org.springframework.stereotype.Component;

@Component
public class MonitorMapper {
    public MonitorDTO mapToMonitorDTO(Monitor monitor){
        return MonitorDTO.builder()
                .id(monitor.getId())
                .name(monitor.getName())
                .manufacturer(monitor.getManufacturer())
                .lowestPrice(monitor.getLowestPrice())
                .averagePrice(monitor.getAveragePrice())
                .screenSize(monitor.getScreenSize())
                .resolution(monitor.getResolution())
                .resolutionType(monitor.getResolutionType())
                .panelType(monitor.getPanelType())
                .refreshRate(monitor.getRefreshRate())
                .aspectRatio(monitor.getAspectRatio())
                .responseTime(monitor.getResponseTime())
                .build();
    }
}
