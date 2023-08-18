package fileHandling;

import java.io.File;

public class PrintFilesName {
    public static void main(String[] args) {
        File folder=new File("Navin");
        String[] filesName= folder.list();
        for (String str:filesName) {
            System.out.println(str);
        }
    }
}
