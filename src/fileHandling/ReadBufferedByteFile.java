package fileHandling;

import java.io.*;

public class ReadBufferedByteFile {
    public static void main(String[] args) throws IOException {
        File file=new File("bufferedFile.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        int data=bufferedInputStream.read();
        while (data!=-1){
            System.out.print((char)data);
            data=bufferedInputStream.read();
        }
        fileInputStream.close();
        bufferedInputStream.close();
    }
}
