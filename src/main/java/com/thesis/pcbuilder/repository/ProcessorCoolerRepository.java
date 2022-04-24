package com.thesis.pcbuilder.repository;

import com.thesis.pcbuilder.model.ProcessorCooler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorCoolerRepository extends JpaRepository<ProcessorCooler,Integer> {
}
