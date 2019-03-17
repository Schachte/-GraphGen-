package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataReader {
    public static BufferedReader readAdjacencyList(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (file.exists()) {
            return new BufferedReader(new FileReader(file));
        }
        throw new RuntimeException("File path is invalid");
    }
}
