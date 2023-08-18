package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharFile {
    public static void main(String[] args) throws IOException {
        File file=new File("navin.txt");
        FileReader fileReader=new FileReader(file);
        int data=fileReader.read();
        while (data!=-1){
            System.out.print((char) data);
            data=fileReader.read();
        }

    }
}
