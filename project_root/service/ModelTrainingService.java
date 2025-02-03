package com.example.dataprocessor.service;
import com.example.dataprocessor.model.DataFrame;
import org.springframework.stereotype.Service;

@Service
public class ModelTrainingService {
    public void trainXGB(DataFrame dataFrame) {
        System.out.println("Training XGBoost model...");
    }
}