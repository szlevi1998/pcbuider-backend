package com.thesis.pcbuilder.domain.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T>{
    Optional<T> getById(Integer id);
    List<T> getAll();
    void saveAll(List<T> list);
}
