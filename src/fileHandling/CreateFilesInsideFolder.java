package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFilesInsideFolder {
    public static void main(String[] args) throws IOException {
        for (int index = 1; index <= 100; index++) {
            File file=new File("Navin/newFolder"+index+".txt");
            file.createNewFile();
        }
        System.out.println("100 files created");
    }
}
