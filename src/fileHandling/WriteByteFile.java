package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteFile {
    public static void main(String[] args) throws IOException {
        File file=new File("abc.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file,true);
        fileOutputStream.write(67);
        System.out.println("Length of file "+file.length());
        fileOutputStream.close();
    }
}
