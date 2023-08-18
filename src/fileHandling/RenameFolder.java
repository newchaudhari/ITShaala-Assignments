package fileHandling;

import java.io.File;

public class RenameFolder {
    public static void main(String[] args) {
        File oldFolder=new File("src/Navin");
        File newFolder=new File("src/Practice");
        boolean isRenamed=oldFolder.renameTo(newFolder);
        System.out.println("Folder Renamed "+isRenamed);

    }
}
