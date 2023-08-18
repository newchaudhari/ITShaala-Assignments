package _9_string;

public class MergeStrings {
    public static void main(String[] args) {
        //Java Program to Merge two String Arrays
        String DadName="Anil Dnyandeo Chaudhari";
        char[] dadNameCharArray=DadName.toCharArray();
        String myName="Navin Anil Chaudhari";
        char[] myNameCharArray=myName.toCharArray();
        char[] mergedString=new char [dadNameCharArray.length+myNameCharArray.length];
        String mergedString1=new String(String.valueOf(dadNameCharArray.length+myNameCharArray.length));
        int mergedIndex=0;
        for (int index = 0; index < dadNameCharArray.length && index<mergedString1.toCharArray().length; index++,mergedIndex++) {
            dadNameCharArray[index]=mergedString[mergedIndex];
        }
        for (int index = 0; index <myNameCharArray.length&& index<mergedString1.toCharArray().length; index++,mergedIndex++) {
            myNameCharArray[index]=mergedString[mergedIndex];
        }
        for (char ch:mergedString) {
            System.out.print(ch);

        }
    }
}
