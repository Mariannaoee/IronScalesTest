import com.fasterxml.jackson.databind.ObjectMapper;
import model.Vulnerabilities;
import model.Vulnerability;
import utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;



public class Question4 {
    private static final Logger logger = Logger.getLogger(Question4.class.getName());


    public Integer question4(String fullPathOfFolder, String libraryName) {

        final File folder = new File(fullPathOfFolder);

        List<String> result = new ArrayList<>();


        result = FileUtils.findFilesByFileEnding(".json", fullPathOfFolder);
        if (result == null)
            return null;
        Vulnerabilities vulnerabilities = readJsonFile(result);
        if (vulnerabilities != null)
            return getDistinctVulnerabilities(vulnerabilities, libraryName);
        return null;
    }


    private static int getDistinctVulnerabilities(Vulnerabilities vulnerabilities, String libraryName) {
        Map<String, String> vulnerabilitiesMap = new HashMap<>();
        for (Vulnerability vulnerability : vulnerabilities.getVulnerabilities()) {
            if (vulnerability.getLibrary().trim().equals(libraryName))
                vulnerabilitiesMap.put(vulnerability.getId(), libraryName);
        }
        return vulnerabilitiesMap.size();
    }

    private static Vulnerabilities readJsonFile(List<String> result) {
        for (String s : result) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                Vulnerabilities testObj = mapper.readValue(new File(s), Vulnerabilities.class);
                return testObj;
            } catch (IOException e) {
                logger.info("ERROR  :  " + e.getMessage());
            }
        }
        return null;
    }
}
