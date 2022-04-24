package com.thesis.pcbuilder.response;

import com.thesis.pcbuilder.dto.MotherboardDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
@Builder
@Getter
public class MotherboardResponse {
    private List<MotherboardDTO> motherboardDTOList;

}
