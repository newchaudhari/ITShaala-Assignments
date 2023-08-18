package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCharFile {
    public static void main(String[] args) throws IOException {
        File file1=new File("new.txt");
        file1.createNewFile();
        FileWriter fileWriter=new FileWriter(file1);
        fileWriter.write("Hi! Welcome to the Session");
        fileWriter.close();
        System.out.println(file1.length());

    }
}
