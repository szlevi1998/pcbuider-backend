package com.thesis.pcbuilder.repository;

import com.thesis.pcbuilder.model.PcCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcCaseRepository extends JpaRepository<PcCase,Integer> {

}
