package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteFile2 {
    public static void main(String[] args) throws IOException {
        File file=new File("abc.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for (int i = 0; i < 500000; i++) {
            fileOutputStream.write(i);
        }
        System.out.println("Length of file "+file.length());
        fileOutputStream.close();
    }
}
