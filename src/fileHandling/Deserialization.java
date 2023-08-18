package fileHandling;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file =new File("navin.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Product product=(Product) objectInputStream.readObject();
        System.out.println(product);




    }
}
