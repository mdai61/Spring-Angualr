package com.example.dataprocessor.controller;
import com.example.dataprocessor.model.DataFrame;
import com.example.dataprocessor.service.DataService;
import com.example.dataprocessor.service.ModelTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(origins = "http://localhost:4200") 
@RestController
@RequestMapping("/api/data")
public class DataController {
    private final DataService dataService;
    private final ModelTrainingService modelTrainingService;

    @Autowired
    public DataController(DataService dataService, ModelTrainingService modelTrainingService) {
        this.dataService = dataService;
        this.modelTrainingService = modelTrainingService;
    }

    @GetMapping("/process")
    public DataFrame processData(@RequestParam String filePath) throws IOException {
        return dataService.getProcessedData(filePath);
    }

    @PostMapping("/train")
    public String trainModel(@RequestParam String filePath) throws IOException {
        DataFrame df = dataService.getProcessedData(filePath);
        modelTrainingService.trainXGB(df);
        return "Model training started!";
    }
}