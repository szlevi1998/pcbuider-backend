package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.response.VideoCardResponse;
import com.thesis.pcbuilder.service.VideoCardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pcbuilder/videocards")
public class VideoCardController {

    private final VideoCardService videoCardService;

    public VideoCardController(VideoCardService videoCardService) {
        this.videoCardService = videoCardService;
    }

    @GetMapping()
    public VideoCardResponse getAllVideoCard() {
        return videoCardService.getAllVideoCard();
    }
}
