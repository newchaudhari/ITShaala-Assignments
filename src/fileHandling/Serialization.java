package fileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Serialization{
    public static void main(String[] args) throws IOException {
        File file=new File("navin.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        Product product0=new Product(54,"Mobile",20000);
        Product product1=new Product(1,"Laptop",76000);
        Product product2=new Product(83,"TV",25000);
        Product product3=new Product(18,"Air Conditioner",34000);
        Product product4=new Product(119,"Watch",2500);
        ArrayList<Product> productList=new ArrayList<>();
        productList.add(product0);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        outputStream.writeObject(productList);

        for (Object obj:productList) {
            System.out.println(obj);
        }
     System.out.println("*******************************************************************");
        Collections.sort(productList,(pr1,pr2)->pr1.getProductId()-pr2.getProductId());
        productList.forEach(product -> System.out.println(product));

        System.out.println("*******************************************************************");
        Collections.sort(productList,(pr1,pr2)->pr1.getProductPrice()-pr2.getProductPrice());
        productList.forEach(product -> System.out.println(product));

    }
}
