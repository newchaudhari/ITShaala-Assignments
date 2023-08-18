package _9_string;

public class DuplicateCount {
    public static void main(String[] args) {
        //Java program to Count Number of Duplicate Words in String
        String str="Navin anil Chaudhari";
        int count=0;
        for (char ch:str.toCharArray()) {
            if (ch=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
