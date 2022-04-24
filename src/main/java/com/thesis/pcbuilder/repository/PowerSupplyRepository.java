package com.thesis.pcbuilder.repository;

import com.thesis.pcbuilder.model.PowerSupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyRepository extends JpaRepository<PowerSupply,Integer> {
}
