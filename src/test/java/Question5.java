import model.Types;
import utils.FileUtils;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

public class Question5 {

    public  void question5() throws Exception {
        String filePath = "src/test/resources/IronScales.txt";
        String fileOutput = "question5_output.json";
//        get list of lines
        List<String> stringsFromFile = FileUtils.readFileByLines(filePath);

        Types types = new Types();
        for (int i = 0; i < stringsFromFile.size(); i++) {
            String charactersFromFile = stringsFromFile.get(i);
            String[] lineString = charactersFromFile.split(":");

            String type = lineString[1].trim();
            String charactersToAdd = lineString[0];

            if (type.equals("High")) {
                types.getHigh().add(charactersToAdd);
            } else if (type.equals("Medium")) {
                types.getMedium().add(charactersToAdd);

            } else {
                types.getLow().add(charactersToAdd);
            }
        }
        Collections.sort(types.getHigh());
        Collections.sort(types.getMedium());
        Collections.sort(types.getLow());
        FileUtils.writeToJsonFile(types,fileOutput);
    }




}
