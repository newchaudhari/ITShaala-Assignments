package _9_string;

public class UniqueString {
    public static void main(String[] args) {
        String string="NavinA";
        boolean b = uniqueCharacters(string);
        System.out.println(b);
    }
    public static boolean uniqueCharacters(String str)
    {
        // If at any time we encounter 2 same
        // characters, return false

        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j))
                    return false;

        // If no duplicate characters encountered,
        // return true
        return true;
    }
}
