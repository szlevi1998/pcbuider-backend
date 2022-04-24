package com.thesis.pcbuilder.response;

import com.thesis.pcbuilder.dto.StorageDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class StorageResponse {
    private List<StorageDTO> storageDTOList;
}
