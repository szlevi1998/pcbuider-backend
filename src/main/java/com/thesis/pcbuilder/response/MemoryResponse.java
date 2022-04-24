package com.thesis.pcbuilder.response;

import com.thesis.pcbuilder.dto.MemoryDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
@Builder
@Getter
public class MemoryResponse {

    private List<MemoryDTO> memoryDTOList;


}
