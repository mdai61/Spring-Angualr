package com.example.dataprocessor.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Data
@AllArgsConstructor
public class DataRow {
    private Date timestamp;
    private double open;
    private double high;
    private double low;
    private double close;
    private double volume;
}