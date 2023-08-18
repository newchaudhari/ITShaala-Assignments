package _9_string;

public class CountWords {
    public static int wordCount(String string) {
        int count = 0;
        char[] ch = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        //Java Program to Count Number of Words in Given String
        String str = "new anil chaudhari";
        System.out.println(wordCount(str));

    }
}
