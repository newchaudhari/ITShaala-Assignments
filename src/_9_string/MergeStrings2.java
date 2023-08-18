package _9_string;

public class MergeStrings2 {
    public static void main(String[] args) {
        //Java Program to Merge two String Arrays
        String[] str1 = {"Hi!", "there,"};
        String[] str2 = {"how", "are", "you?"};
        String[] mergedString = new String[str1.length + str2.length];

        int indexOfMergedString = 0;

        for (int index = 0; index < str1.length && index < mergedString.length; index++, indexOfMergedString++) {
            mergedString[indexOfMergedString]=str1[index];
        }

        for (int index = indexOfMergedString; index < str2.length && index < mergedString.length; index++, indexOfMergedString++) {
            mergedString[indexOfMergedString]=str2[index];
        }

        for (String str:mergedString) {
            System.out.print(str+" ");
        }
    }
}
