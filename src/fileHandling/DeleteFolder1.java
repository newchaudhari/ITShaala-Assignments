package fileHandling;

import java.io.File;

public class DeleteFolder1 {
    public static void main(String[] args) {
    File folder=new File("src/Practice");
    boolean isFolderCreated= folder.mkdir();
        System.out.println(isFolderCreated);
        folder.delete();
    }
}
