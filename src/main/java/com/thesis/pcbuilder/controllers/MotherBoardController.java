package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.response.MotherboardResponse;
import com.thesis.pcbuilder.service.MotherboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pcbuilder/motherboards")
public class MotherBoardController {

    private final MotherboardService motherboardService;

    public MotherBoardController(MotherboardService motherboardService) {
        this.motherboardService = motherboardService;
    }

    @GetMapping
    public MotherboardResponse getAllMotherBoard() {
      return motherboardService.getAllMotherboard();
    }

}
