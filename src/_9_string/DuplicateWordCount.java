package _9_string;
import java.util.*;

public class DuplicateWordCount {
    public static void main(String[] args) {
        String inputString = "java is a programming language java is object-oriented programming language";

        // Count duplicate words
        Map<String, Integer> wordCountMap = countDuplicateWords(inputString);

        // Print the duplicate words and their occurrences
        System.out.println("Duplicate words and their occurrences:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }

        // Print the number of characters in the string
        int characterCount = inputString.length();
        System.out.println("\nNumber of characters in the string: " + characterCount);
    }

    private static Map<String, Integer> countDuplicateWords(String inputString) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words
        String[] words = inputString.split("\\s+");

        // Count occurrences of each word
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase to make it case-insensitive
            if (wordCountMap.containsKey(word)) {
                // If the word is already present in the map, increment its count
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is encountered for the first time, add it to the map with count 1
                wordCountMap.put(word, 1);
            }
        }

        // Filter out words with count 1 (non-duplicates)
        wordCountMap.entrySet().removeIf(entry -> entry.getValue() == 1);

        return wordCountMap;
    }
}
