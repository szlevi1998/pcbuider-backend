package com.thesis.pcbuilder.response;

import com.thesis.pcbuilder.dto.ProcessorCoolerDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ProcessorCoolerResponse {
    private List<ProcessorCoolerDTO> processorCoolerDTOList;

}
