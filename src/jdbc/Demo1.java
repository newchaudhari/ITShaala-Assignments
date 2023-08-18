package jdbc;

import java.lang.reflect.Field;

public class Demo1 {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {
        Product product1 = new Product(1, "Laptop", 100);
        Product product2 = (Product) product1.clone();

//        Product product2 = new Product(product1);

        System.out.println(product1);
        System.out.println(product2);

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        Class classValue = Class.forName("jdbc.Product");

        String classLoaderName = classValue.getClassLoader().toString();
        System.out.println(classLoaderName);


        Field[] fields = classValue.getFields();
        for (Field f:fields) {
            System.out.println(f);
        }

    }
}
