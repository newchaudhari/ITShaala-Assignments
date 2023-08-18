package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file=new File("new.txt");
        boolean isFile= file.createNewFile();
        System.out.println(isFile);

    }


}
