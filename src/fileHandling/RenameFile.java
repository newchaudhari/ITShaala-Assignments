package fileHandling;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File file=new File("new.txt");
        File file1=new File("navin.txt");
        boolean renameTo=file.renameTo(file1);
        System.out.println("File renamed "+renameTo);
        File file2=new File("bufferedFile.txt");
        File file3=new File("bufferedByteFile.txt");
        file2.renameTo(file3);

    }
}
