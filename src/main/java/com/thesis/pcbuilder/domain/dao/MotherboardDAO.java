package com.thesis.pcbuilder.domain.dao;

import com.thesis.pcbuilder.model.Motherboard;
import com.thesis.pcbuilder.repository.MotherboardRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class MotherboardDAO implements DAO<Motherboard> {

    private final MotherboardRepository motherboardRepository;

    public MotherboardDAO(MotherboardRepository motherboardRepository) {
        this.motherboardRepository = motherboardRepository;
    }

    @Override
    public Optional<Motherboard> getById(Integer id) {
        return motherboardRepository.findById(id);
    }

    @Override
    public List<Motherboard> getAll() {
        return motherboardRepository.findAll();
    }

    @Override
    public void saveAll(List<Motherboard> motherboardList) {
        motherboardRepository.saveAll(motherboardList);
    }

}
