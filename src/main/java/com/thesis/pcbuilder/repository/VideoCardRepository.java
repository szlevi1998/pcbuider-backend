package com.thesis.pcbuilder.repository;

import com.thesis.pcbuilder.model.VideoCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCardRepository extends JpaRepository<VideoCard,Integer> {
}
