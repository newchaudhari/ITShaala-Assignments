package __strinng_handling;

import java.util.Locale;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Hi! welcome to the home";
        str.toUpperCase(Locale.ROOT);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace("home", "school"));

        String str1 = "Hi! welcome to the Home";
        System.out.println(str1.trim());
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str == str1);


        String[] string = str1.split("");

        int left = 0;
        int right = string.length - 1;
       while (left<right){
            String temp = string[left];
            string[left] = string[right];
            string[right] = temp;
            left++;
            right--;

        }
        for (int index = 0; index < string.length; index++) {
            System.out.print(string[index]+" ");
        }


    }
}
