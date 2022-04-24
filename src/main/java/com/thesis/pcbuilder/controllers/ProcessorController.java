package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.response.ProcessorResponse;
import com.thesis.pcbuilder.service.ProcessorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pcbuilder/processors")
public class ProcessorController {

    private final ProcessorService processorService;

    public ProcessorController(ProcessorService processorService) {
        this.processorService = processorService;
    }

    @GetMapping
    public ProcessorResponse getAllProcessor() {
        return processorService.getAllProcessor();
    }
}
