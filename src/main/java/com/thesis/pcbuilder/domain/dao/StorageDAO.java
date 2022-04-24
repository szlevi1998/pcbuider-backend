package com.thesis.pcbuilder.domain.dao;

import com.thesis.pcbuilder.model.Storage;
import com.thesis.pcbuilder.repository.StorageRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class StorageDAO implements DAO<Storage> {

    private final StorageRepository storageRepository;

    public StorageDAO(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    @Override
    public Optional<Storage> getById(Integer id) {
        return storageRepository.findById(id);
    }

    @Override
    public List<Storage> getAll() {
        return storageRepository.findAll();
    }

    @Override
    public void saveAll(List<Storage> storageList) {
        storageRepository.saveAll(storageList);
    }


}
