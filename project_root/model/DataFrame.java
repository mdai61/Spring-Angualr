package com.example.dataprocessor.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class DataFrame {
    private List<DataRow> rows;
}