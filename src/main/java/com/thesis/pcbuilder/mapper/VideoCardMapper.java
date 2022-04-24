package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.dto.VideoCardDTO;
import com.thesis.pcbuilder.model.VideoCard;
import org.springframework.stereotype.Component;

@Component
public class VideoCardMapper {
    public VideoCardDTO mapToVideoCardDTO(VideoCard videoCard){
        return VideoCardDTO.builder()
                .id(videoCard.getId())
                .name(videoCard.getName())
                .manufacturer(videoCard.getManufacturer())
                .lowestPrice(videoCard.getLowestPrice())
                .averagePrice(videoCard.getAveragePrice())
                .videoCardType(videoCard.getVideoCardType())
                .videoChipset(videoCard.getVideoChipset())
                .memorySize(videoCard.getMemorySize())
                .memoryType(videoCard.getMemoryType())
                .build();
    }
}
