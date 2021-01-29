package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Types;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    public static void writeToJsonFile(Types types, String fileName) {
        //Write JSON file
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File(fileName), types);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFileByLines(String filePath) throws Exception {
        List<String> stringsFromFile = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                stringsFromFile.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new Exception("Cant read the file because : " + e.getMessage());
        }
        return stringsFromFile;
    }

    public static List<String> findFilesByFileEnding(String fileEnding, String fullPathOfFolder) {
        List<String> results = new ArrayList<String>();
        File[] files = new File(fullPathOfFolder).listFiles();
        if (files == null) {
            return null;
        }
//If this pathname does not denote a directory, then listFiles() returns null.

        for (File file : files) {
            if (file.isFile()) {
                if (file.getName().endsWith(fileEnding)) {
                    results.add(file.getPath());
                }
            }
        }
        return results;

    }
}
