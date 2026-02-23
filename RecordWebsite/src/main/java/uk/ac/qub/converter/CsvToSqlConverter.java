package uk.ac.qub.converter;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvToSqlConverter {
    public static void main(String[] args) throws IOException {
        String csvFilePath = "RecordWebsite/src/main/resources/data/album_list_new.csv"; //"path/to/your/csvfile.csv";
        String sqlFilePath = "RecordWebsite/src/main/resources/data.sql"; //"path/to/your/outputfile.sql";
        String tableName = "albums"; // Replace with your actual table name
        String[] columnNames = {"number", "album_year", "title", "artist", "genre", "sub_genre", "image_link"}; // Replace with your actual column names
        Class<?>[] columnTypes = {Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class}; // Replace with your actual column types

        try (
                CSVReader reader = new CSVReader(Files.newBufferedReader(Paths.get(csvFilePath)));
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(sqlFilePath))
        ) {
            String[] values;
            while ((values = reader.readNext()) != null) {
                StringBuilder sql = new StringBuilder(
                        String.format("INSERT INTO %s(", tableName)
                );
                sql.append(String.join(", ", columnNames)).append(") VALUES (");
                for (int i = 0; i < values.length; i++) {
                    String value = values[i].trim();
                    if (columnTypes[i] == String.class) {
                        sql.append("'").append(value.replace("'", "''")).append("'");
                    } else {
                        sql.append(value);
                    }
                    if (i < values.length - 1) {
                        sql.append(", ");
                    }
                }
                sql.append(");");
                writer.write(sql.toString());
                writer.newLine();
            }
//        List<String> lines = Files.readAllLines(Paths.get(csvFilePath));
//        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(sqlFilePath))) {
//            for (String line : lines) {
//                String[] values = line.split(",");
//                String sql = String.format(
//                        "INSERT INTO %s (%s, %s, %s, %s, %s, %s, %s) VALUES (%s, '%s', '%s', '%s', '%s', %s, '%s');",
//                        tableName, columnNames[0], columnNames[1], columnNames[2], columnNames[3], columnNames[4], columnNames[5], columnNames[6],
//                        values[0].trim(), values[1].trim(), values[2].trim(), values[3].trim(), values[4].trim(), values[5].trim(), values[6].trim()
//                );
//                writer.write(sql);
//                writer.newLine();
//            }
//        }
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
