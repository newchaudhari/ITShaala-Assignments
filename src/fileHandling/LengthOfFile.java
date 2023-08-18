package fileHandling;

import java.io.File;

public class LengthOfFile {
    public static void main(String[] args) {
        File file=new File("navin.txt");
        System.out.println(file.length());
    }
}
