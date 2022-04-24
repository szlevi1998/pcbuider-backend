package com.thesis.pcbuilder.domain.dao;

import com.thesis.pcbuilder.model.VideoCard;
import com.thesis.pcbuilder.repository.VideoCardRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class VideoCardDAO implements DAO<VideoCard> {

    private final VideoCardRepository videoCardRepository;

    public VideoCardDAO(VideoCardRepository videoCardRepository) {
        this.videoCardRepository = videoCardRepository;
    }

    @Override
    public Optional<VideoCard> getById(Integer id) {
        return videoCardRepository.findById(id);
    }

    @Override
    public List<VideoCard> getAll() {
        return videoCardRepository.findAll();
    }

    public void saveAll(List<VideoCard> videoCardList){
        videoCardRepository.saveAll(videoCardList);
    }
}
