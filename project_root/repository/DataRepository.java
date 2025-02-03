package com.example.dataprocessor.repository;
import com.example.dataprocessor.model.DataFrame;
import com.example.dataprocessor.model.DataRow;
import org.springframework.stereotype.Repository;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class DataRepository {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public DataFrame loadData(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        List<DataRow> data = lines.stream()
            .map(line -> {
                String[] values = line.split(",");
                try {
                    return new DataRow(
                        DATE_FORMAT.parse(values[0]),
                        Double.parseDouble(values[1]),
                        Double.parseDouble(values[2]),
                        Double.parseDouble(values[3]),
                        Double.parseDouble(values[4]),
                        Double.parseDouble(values[5])
                    );
                } catch (Exception e) {
                    throw new RuntimeException("Error parsing data row: " + Arrays.toString(values), e);
                }
            })
            .collect(Collectors.toList());

        return new DataFrame(data);
    }
}