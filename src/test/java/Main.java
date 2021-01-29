import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    @Test
    public void Question4() {

        String fullPathOfFolder = "src/test/resources";
        String libraryName = "taglibs-2.3.1";
        Question4 question4 = new Question4();
        Integer answer4 = question4.question4(fullPathOfFolder, libraryName);
        Assert.assertNotNull(answer4);
        logger.info("number of distinct id : " + answer4);
    }


    @Test
    public void Question5() throws Exception {
        Question5 question5 = new Question5();
        question5.question5();
    }

    @Test
    public void Question6() {
        String[] names = new String[]{"marianna", "test", "avi"};
        int lengthName = 4;
        Question6 question6 = new Question6();
        List<String> answer6 = question6.question6(names, lengthName);
        logger.info("question 6 output : {} " + answer6);

    }

    @Test
    public void Question7() throws Exception {
        String pathFolderToDelete = "src/test/Test";
        Question7 question7 = new Question7();
        question7.question7(pathFolderToDelete);

    }


}
