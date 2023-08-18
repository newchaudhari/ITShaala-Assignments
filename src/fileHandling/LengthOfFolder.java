package fileHandling;

import java.io.File;

public class LengthOfFolder {
    public static void main(String[] args) {
        File folder=new File("src/Practice");
        System.out.println("Length of Folder "+folder.length());
    }
}
