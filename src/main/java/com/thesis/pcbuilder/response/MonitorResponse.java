package com.thesis.pcbuilder.response;

import com.thesis.pcbuilder.dto.MonitorDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class MonitorResponse {

    private List<MonitorDTO> monitorDTOList;

}
