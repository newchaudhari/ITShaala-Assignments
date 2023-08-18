package fileHandling;

import java.io.File;

public class CreateNewFolder {
    public static void main(String[] args) {
        File folder=new File("Navin");
        boolean isFolderCreated=folder.mkdir();
        System.out.println("is new folder created "+isFolderCreated);


    }
}
