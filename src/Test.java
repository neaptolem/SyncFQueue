import java.util.ArrayList;
import java.util.Date;
import CustomFile.FileItem;

public class Test extends Thread {


    public void run() {

    }

    public ArrayList<FileItem> generateCustomFile(String  s) {
        ArrayList<FileItem> fileItems = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                fileItems.add(new FileItem(s + " " + i + " " + j, new Date()));
            }
        }
        return fileItems;
    }
}
