package fileHandling;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File folder = new File("src/Practice");
        boolean isFolderDeleted = folder.delete();
        System.out.println("Is folder deleted " + isFolderDeleted);
    }
}
