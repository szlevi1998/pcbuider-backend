package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.domain.dao.VideoCardDAO;
import com.thesis.pcbuilder.dto.VideoCardDTO;
import com.thesis.pcbuilder.mapper.VideoCardMapper;
import com.thesis.pcbuilder.response.VideoCardResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoCardService {
    private final VideoCardDAO videoCardDAO;
    private final VideoCardMapper videoCardMapper;

    public VideoCardService(VideoCardDAO videoCardDAO, VideoCardMapper videoCardMapper) {
        this.videoCardDAO = videoCardDAO;
        this.videoCardMapper = videoCardMapper;
    }
    public VideoCardResponse getAllVideoCard(){
        List<VideoCardDTO> videoCardList = videoCardDAO.getAll().stream()
                .map(videoCardMapper::mapToVideoCardDTO)
                .toList();
        return VideoCardResponse.builder()
                .videoCardDTOList(videoCardList)
                .build();
    }
}
