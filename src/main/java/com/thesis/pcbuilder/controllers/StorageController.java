package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.response.StorageResponse;
import com.thesis.pcbuilder.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pcbuilder/storages")
public class StorageController {

    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping
    public StorageResponse getAllStorage() {
        return storageService.getAllStorage();
    }

}
