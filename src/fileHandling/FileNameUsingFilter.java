package fileHandling;

import java.io.File;

public class FileNameUsingFilter {
    public static void main(String[] args) {
        File file=new File("src/fileHandling");
        String[] fileNames=file.list(((dir, name) ->name.endsWith(".java")));
        for (String filename:fileNames) {
            System.out.println(filename+"\t"+filename.length());
        }
    }
}
