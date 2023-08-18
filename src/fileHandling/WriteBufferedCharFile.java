package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteBufferedCharFile {
    public static void main(String[] args) throws IOException {
        File file=new File("bufferedCharFile.txt");
        file.createNewFile();
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (int i  = 0; i <5000 ; i++) {
            bufferedWriter.write((char)i);
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
