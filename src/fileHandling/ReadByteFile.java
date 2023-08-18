package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadByteFile {
    public static void main(String[] args) throws IOException {
        File file=new File("abc.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        int data=fileInputStream.read();
        while (data!=-1){
            System.out.print((char)data);
            data=fileInputStream.read();
        }
    }
}
