package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.domain.dao.StorageDAO;
import com.thesis.pcbuilder.dto.StorageDTO;
import com.thesis.pcbuilder.mapper.StorageMapper;
import com.thesis.pcbuilder.response.StorageResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageService {
    private final StorageDAO storageDAO;
    private final StorageMapper storageMapper;

    public StorageService(StorageDAO storageDAO, StorageMapper storageMapper) {
        this.storageDAO = storageDAO;
        this.storageMapper = storageMapper;
    }
    public StorageResponse getAllStorage(){
        List<StorageDTO> storageList = storageDAO.getAll().stream()
                .map(storageMapper::mapToStorageDTO)
                .toList();
        return StorageResponse.builder()
                .storageDTOList(storageList)
                .build();
    }
}
