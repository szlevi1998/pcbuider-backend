package com.thesis.pcbuilder.repository;

import com.thesis.pcbuilder.model.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorRepository extends JpaRepository<Processor,Integer> {
}
