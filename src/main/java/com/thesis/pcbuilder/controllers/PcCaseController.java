package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.response.PcCaseResponse;
import com.thesis.pcbuilder.service.PcCaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pcbuilder/cases")
public class PcCaseController {

    private final PcCaseService pcCaseService;
    public PcCaseController(PcCaseService pcCaseService) {
        this.pcCaseService = pcCaseService;
    }

    @GetMapping
    public PcCaseResponse getAllCase() {
        return pcCaseService.getAllPcCase();
    }

}
