package com.thesis.pcbuilder.repository;

import com.thesis.pcbuilder.model.Memory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoryRepository extends JpaRepository<Memory,Integer> {
}
