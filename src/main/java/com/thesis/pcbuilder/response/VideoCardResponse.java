package com.thesis.pcbuilder.response;

import com.thesis.pcbuilder.dto.VideoCardDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class VideoCardResponse {
    private List<VideoCardDTO> videoCardDTOList;
}
