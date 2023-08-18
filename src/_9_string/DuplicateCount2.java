package _9_string;

import java.util.Locale;

public class DuplicateCount2 {
    public static void main(String[] args) {
        //Java program to Count Number of Duplicate Words in String
        String str="Big black bug bit a big black dog on his big black nose";
        str=str.toLowerCase();
        int count;
        String[] words= str.split(" ");
        System.out.println("Print Duplicate words");
        for (int i = 0; i < words.length; i++) {
            count=1;
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])){
                count++;
                words[j]="0";
            }
            
        }
        if (count>1&&words[i]!="0"){
            System.out.println(words[i]);
        }

    }
}
}
