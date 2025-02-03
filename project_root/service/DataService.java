package com.example.dataprocessor.service;
import com.example.dataprocessor.model.DataFrame;
import com.example.dataprocessor.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DataService {
    private final DataRepository dataRepository;

    @Autowired
    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public DataFrame getProcessedData(String filePath) throws IOException {
        return dataRepository.loadData(filePath);
    }
}