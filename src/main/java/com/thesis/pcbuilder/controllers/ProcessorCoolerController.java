package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.response.ProcessorCoolerResponse;
import com.thesis.pcbuilder.service.ProcessorCoolerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pcbuilder/processorcoolers")
public class ProcessorCoolerController {

    private final ProcessorCoolerService processorCoolerService;

    public ProcessorCoolerController(ProcessorCoolerService processorCoolerService) {
        this.processorCoolerService = processorCoolerService;
    }

    @GetMapping
    public ProcessorCoolerResponse getAllProcessorCooler() {
        return processorCoolerService.getAllProcessorCooler();
    }

}
