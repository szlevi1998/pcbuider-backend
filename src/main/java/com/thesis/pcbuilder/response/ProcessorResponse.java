package com.thesis.pcbuilder.response;

import com.thesis.pcbuilder.dto.ProcessorDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ProcessorResponse {
    private List<ProcessorDTO> processorDTOList;

}
