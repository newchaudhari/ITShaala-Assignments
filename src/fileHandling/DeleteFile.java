package fileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("navin.txt");
        boolean isFileDeleted = file.delete();
        System.out.println(isFileDeleted);
        File file1=new File("bufferedByteFile.txt");
        File file2=new File("bufferedCharFile.txt");
        File file3=new File("abc.txt");
        file1.delete();
        file2.delete();
        file3.delete();
            File file4=new File("Navin");
            file4.delete();


    }
}
