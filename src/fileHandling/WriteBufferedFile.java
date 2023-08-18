package fileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBufferedFile {
    public WriteBufferedFile(FileOutputStream fileOutputStream) {
    }

    public static void main(String[] args) throws IOException {
        File file=new File("bufferedFile.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        BufferedOutputStream bufferedFile=new BufferedOutputStream(fileOutputStream);
        for (int index = 0; index < 500000; index++) {
            bufferedFile.write(index);
        }
        bufferedFile.close();
        fileOutputStream.close();
    }
}
