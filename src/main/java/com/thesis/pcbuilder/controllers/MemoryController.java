package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.response.MemoryResponse;
import com.thesis.pcbuilder.service.MemoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pcbuilder/memories")
public class MemoryController {

    private final MemoryService memoryService;


    public MemoryController(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @GetMapping
    public MemoryResponse getAllMemory() {
        return memoryService.getAllMemory();
    }

}
