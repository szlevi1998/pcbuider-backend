package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.domain.dao.PowerSupplyDAO;
import com.thesis.pcbuilder.dto.PowerSupplyDTO;
import com.thesis.pcbuilder.mapper.PowerSupplyMapper;
import com.thesis.pcbuilder.response.PowerSupplyResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerSupplyService {
    private final PowerSupplyDAO powerSupplyDAO;
    private final PowerSupplyMapper powerSupplyMapper;

    public PowerSupplyService(PowerSupplyDAO powerSupplyDAO, PowerSupplyMapper powerSupplyMapper) {
        this.powerSupplyDAO = powerSupplyDAO;
        this.powerSupplyMapper = powerSupplyMapper;
    }

    public PowerSupplyResponse getAllPowerSupply(){
        List<PowerSupplyDTO> powerSupplyList = powerSupplyDAO.getAll().stream()
                .map(powerSupplyMapper::mapToPowerSupplyDTO)
                .toList();
        return PowerSupplyResponse.builder()
                .powerSupplyDTOList(powerSupplyList)
                .build();
    }

}
