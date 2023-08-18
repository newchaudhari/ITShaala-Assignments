package _5_if_Else;

import java.security.cert.CertificateRevokedException;
import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        //1. Ask user to enter age, gender ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
        //2. if employee is female, then she will work only in urban areas.
        //3. if employee is a male and age is in between 20 to 40 then he may work in anywhere
        //4. if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
        //5. And any other input of age should print "ERROR"

        Scanner scanner =new Scanner(System.in);
        System.out.println("Age");
        int age = scanner.nextInt();

        System.out.println("Gender M or F");
        char gender =scanner.next().charAt(0);

        System.out.println("Marital status Y or N");
        char maritalStatus =scanner.next().charAt(0);

        if (gender=='F' && age>=20){
            System.out.println("You can work only in urban areas");
        } else if (gender=='M' && age>=20 &&age<=40) {
            System.out.println("You can work anywhere");
        } else if (gender=='M' && age>40 && age<=60) {
            System.out.println("You can work only in urban areas");
        }else {
            System.out.println("ERROR");
        }


    }
}
