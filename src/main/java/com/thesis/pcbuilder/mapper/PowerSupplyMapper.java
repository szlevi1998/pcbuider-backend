package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.dto.PowerSupplyDTO;
import com.thesis.pcbuilder.model.PowerSupply;
import org.springframework.stereotype.Component;

@Component
public class PowerSupplyMapper {
        public PowerSupplyDTO mapToPowerSupplyDTO(PowerSupply powerSupply){
            return PowerSupplyDTO.builder()
                    .id(powerSupply.getId())
                    .name(powerSupply.getName())
                    .manufacturer(powerSupply.getManufacturer())
                    .lowestPrice(powerSupply.getLowestPrice())
                    .averagePrice(powerSupply.getAveragePrice())
                    .powerSupplyType(powerSupply.getPowerSupplyType())
                    .performanceWattage(powerSupply.getPerformanceWattage())
                    .efficiency(powerSupply.getEfficiency())
                    .build();
        }
}
