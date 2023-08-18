package _9_string;

public class CountSubstring {
    public static void main(String[] args) {
        //Java Program to Count the Number of Occurrences of Substring in a String
        String str="Big black bug bit a big black dog on his big black nose";
        int count=(str.split("big").length-1);
        System.out.println("String Occurrences : "+count);
    }
}
