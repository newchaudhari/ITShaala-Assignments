package _5_if_Else;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {

        //Take input of age of 3 people by user and determine oldest and youngest among them.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Age 1");
        int age1 = scanner.nextInt();

        System.out.println("Age 2");
        int age2 = scanner.nextInt();

        System.out.println("Age 3");
        int age3 = scanner.nextInt();

        if (age1>age2 && age1>age3){
            System.out.println("Age 1 is oldest");

        } else if (age2>age1 && age2>age3) {
            System.out.println("Age 2 is oldest");

        } else if(age3>age1 && age3>age2) {
            System.out.println("Age 3 is oldest");
        } else {
            System.out.println("All are of same age");
        }

        if (age1<age2 &&  age1<age3){
            System.out.println("Age 1 is youngest");

        }else if (age2<age1 &&  age2<age3){
            System.out.println("Age 2 is youngest");

        }else if (age3<age1 &&  age3<age2){
            System.out.println("Age 3 is youngest");
        }

        }

    }
