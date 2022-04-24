package com.thesis.pcbuilder.response;

import com.thesis.pcbuilder.dto.PcCaseDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class PcCaseResponse {
    private List<PcCaseDTO> pcCaseDTOList;
}
