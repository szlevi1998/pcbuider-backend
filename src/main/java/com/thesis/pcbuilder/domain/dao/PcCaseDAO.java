package com.thesis.pcbuilder.domain.dao;

import com.thesis.pcbuilder.model.PcCase;
import com.thesis.pcbuilder.repository.PcCaseRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PcCaseDAO implements DAO<PcCase> {

    private final PcCaseRepository pcCaseRepository;

    public PcCaseDAO(PcCaseRepository pcCaseRepository) {
        this.pcCaseRepository = pcCaseRepository;
    }

    @Override
    public Optional<PcCase> getById(Integer id) {
        return pcCaseRepository.findById(id);
    }

    @Override
    public List<PcCase> getAll() {
        return pcCaseRepository.findAll();
    }

    @Override
    public void saveAll(List<PcCase> pcCaseList) {
        pcCaseRepository.saveAll(pcCaseList);
    }

}
