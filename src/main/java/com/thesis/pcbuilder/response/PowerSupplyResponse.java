package com.thesis.pcbuilder.response;

import com.thesis.pcbuilder.dto.PowerSupplyDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class PowerSupplyResponse {
    private List<PowerSupplyDTO> powerSupplyDTOList;
}
