package com.thesis.pcbuilder.domain.dao;

import com.thesis.pcbuilder.model.PowerSupply;
import com.thesis.pcbuilder.repository.PowerSupplyRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class PowerSupplyDAO implements DAO<PowerSupply> {

    private final PowerSupplyRepository powerSupplyRepository;

    public PowerSupplyDAO(PowerSupplyRepository powerSupplyRepository) {
        this.powerSupplyRepository = powerSupplyRepository;
    }

    @Override
    public Optional<PowerSupply> getById(Integer id) {
        return powerSupplyRepository.findById(id);
    }

    @Override
    public List<PowerSupply> getAll() {
        return powerSupplyRepository.findAll();
    }

    @Override
    public void saveAll(List<PowerSupply> powerSupplyList) {
        powerSupplyRepository.saveAll(powerSupplyList);
    }

}
