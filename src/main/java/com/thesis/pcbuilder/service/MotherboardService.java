package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.domain.dao.MotherboardDAO;
import com.thesis.pcbuilder.dto.MotherboardDTO;
import com.thesis.pcbuilder.mapper.MotherboardMapper;
import com.thesis.pcbuilder.response.MotherboardResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotherboardService {

    private final MotherboardMapper motherboardMapper;
    private final MotherboardDAO motherboardDAO;


    public MotherboardService(MotherboardMapper motherboardMapper, MotherboardDAO motherboardDAO) {
        this.motherboardMapper = motherboardMapper;
        this.motherboardDAO = motherboardDAO;
    }


    public MotherboardResponse getAllMotherboard() {
        List<MotherboardDTO> motherboardList = motherboardDAO.getAll().stream()
                .map(motherboardMapper::mapToMotherboardDTO)
                .toList();

        return MotherboardResponse.builder()
                .motherboardDTOList(motherboardList)
                .build();
    }

}
