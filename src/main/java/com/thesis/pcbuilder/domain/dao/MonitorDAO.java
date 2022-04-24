package com.thesis.pcbuilder.domain.dao;

import com.thesis.pcbuilder.model.Monitor;
import com.thesis.pcbuilder.repository.MonitorRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class MonitorDAO implements DAO<Monitor> {

    private final MonitorRepository monitorRepository;

    public MonitorDAO(MonitorRepository monitorRepository) {
        this.monitorRepository = monitorRepository;
    }

    @Override
    public Optional<Monitor> getById(Integer id) {
        return monitorRepository.findById(id);
    }

    @Override
    public List<Monitor> getAll() {
        return monitorRepository.findAll();
    }

    @Override
    public void saveAll(List<Monitor> monitorList) {
        monitorRepository.saveAll(monitorList);
    }

}
