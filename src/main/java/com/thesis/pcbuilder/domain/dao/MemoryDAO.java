package com.thesis.pcbuilder.domain.dao;

import com.thesis.pcbuilder.model.Memory;
import com.thesis.pcbuilder.repository.MemoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MemoryDAO implements DAO<Memory> {

    private final MemoryRepository memoryRepository;

    public MemoryDAO(MemoryRepository memoryRepository) {
        this.memoryRepository = memoryRepository;
    }

    @Override
    public Optional<Memory> getById(Integer id) {
        return memoryRepository.findById(id);
    }

    @Override
    public List<Memory> getAll() {
        return memoryRepository.findAll();
    }

    @Override
    public void saveAll(List<Memory> memoryList) {
        memoryRepository.saveAll(memoryList);
    }
}


