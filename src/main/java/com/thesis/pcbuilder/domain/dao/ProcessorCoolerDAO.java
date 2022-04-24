package com.thesis.pcbuilder.domain.dao;

import com.thesis.pcbuilder.model.ProcessorCooler;
import com.thesis.pcbuilder.repository.ProcessorCoolerRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class ProcessorCoolerDAO implements DAO<ProcessorCooler> {

    private final ProcessorCoolerRepository processorCoolerRepository;

    public ProcessorCoolerDAO(ProcessorCoolerRepository processorCoolerRepository) {
        this.processorCoolerRepository = processorCoolerRepository;
    }

    @Override
    public Optional<ProcessorCooler> getById(Integer id) {
        return processorCoolerRepository.findById(id);
    }

    @Override
    public List<ProcessorCooler> getAll() {

        return processorCoolerRepository.findAll();
    }

    @Override
    public void saveAll(List<ProcessorCooler> processorCoolerList) {
        processorCoolerRepository.saveAll(processorCoolerList);
    }


}
