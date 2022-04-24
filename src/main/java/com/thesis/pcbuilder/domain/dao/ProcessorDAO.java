package com.thesis.pcbuilder.domain.dao;

import com.thesis.pcbuilder.model.Processor;
import com.thesis.pcbuilder.repository.ProcessorRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProcessorDAO implements DAO<Processor> {

    private final ProcessorRepository processorRepository;

    public ProcessorDAO(ProcessorRepository processorRepository) {
        this.processorRepository = processorRepository;
    }

    @Override
    public Optional<Processor> getById(Integer id) {
        return processorRepository.findById(id);
    }

    @Override
    public List<Processor> getAll() {
        return processorRepository.findAll();
    }

    public void saveAll(List<Processor> processorList){
        processorRepository.saveAll(processorList);
    }
}
