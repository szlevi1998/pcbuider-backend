package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.domain.dao.PcCaseDAO;
import com.thesis.pcbuilder.dto.PcCaseDTO;
import com.thesis.pcbuilder.mapper.PcCaseMapper;
import com.thesis.pcbuilder.response.PcCaseResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcCaseService {
    private final PcCaseDAO pcCaseDAO;
    private final PcCaseMapper pcCaseMapper;

    public PcCaseService(PcCaseDAO pcCaseDAO, PcCaseMapper pcCaseMapper) {
        this.pcCaseDAO = pcCaseDAO;
        this.pcCaseMapper = pcCaseMapper;
    }

    public PcCaseResponse getAllPcCase() {
        List<PcCaseDTO> pcCasesList = pcCaseDAO.getAll().stream()
                .map(pcCaseMapper::mapToPcCaseDTO)
                .toList();
        return PcCaseResponse.builder()
                .pcCaseDTOList(pcCasesList)
                .build();
    }

}
