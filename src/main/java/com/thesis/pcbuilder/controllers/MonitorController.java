package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.response.MonitorResponse;
import com.thesis.pcbuilder.service.MonitorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pcbuilder/monitors")
public class MonitorController {

    private final MonitorService monitorService;


    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @GetMapping
    public MonitorResponse getAllMonitor() {
        return monitorService.getAllMonitor();
    }

}
