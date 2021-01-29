import java.util.ArrayList;
import java.util.List;

public class Question6 {

    public  List<String> question6(String[] names, int lengthName) {
        List<String> finalList = new ArrayList<>();
        for (String name : names) {
            if (name.length() > lengthName)
                finalList.add(name);
        }
        return finalList;
    }
}
