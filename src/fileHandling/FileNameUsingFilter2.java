package fileHandling;

import java.io.File;

public class FileNameUsingFilter2 {
    public static void main(String[] args) {
        File file=new File("src/__array");
        String[] fileNames=file.list(((dir, name) ->name.endsWith(".java")));
        for (String filename:fileNames) {
            System.out.println(filename+"\t"+filename.length());
        }

    }
}