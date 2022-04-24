package com.thesis.pcbuilder.repository;

import com.thesis.pcbuilder.model.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor,Integer> {
}
