package com.thesis.pcbuilder.repository;

import com.thesis.pcbuilder.model.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardRepository extends JpaRepository<Motherboard,Integer> {
}
