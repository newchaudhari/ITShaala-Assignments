package fileHandling;

import java.io.*;

public class ReadBufferedCharFile {
    public static void main(String[] args) throws IOException {
        File file=new File("bufferedCharFile.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        int data = bufferedReader.read();
        while (data!=-1){
            System.out.print((char) data);
        }
        bufferedReader.close();
        fileReader.close();
    }
}
