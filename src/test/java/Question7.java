import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Question7 {
    //    question 7
    public  void question7(String pathFolderToDelete) throws Exception {
        try {
            FileUtils.deleteDirectory(new File(pathFolderToDelete));
        } catch (IOException e) {
            throw new Exception("Cant delete this folder");
        }
    }
}
