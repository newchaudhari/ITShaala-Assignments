package __array;

public class MaxNumber {
    public static void main(String[] args) {
        // Test case 1: array with positive integers
        int[] arr1 = {25, 11, 7, 75, 56};
        int expectedOutput1 = 75;
        int actualOutput1 = findLargestElement(arr1);
        System.out.println("Test case 1: " + (actualOutput1 == expectedOutput1 ? "PASS" : "FAIL"));

        // Test case 2: array with negative integers
        int[] arr2 = {-25, -11, -7, -75, -56};
        int expectedOutput2 = -7;
        int actualOutput2 = findLargestElement(arr2);
        System.out.println("Test case 2: " + (actualOutput2 == expectedOutput2 ? "PASS" : "FAIL"));

        // Test case 3: array with only one element
        int[] arr3 = {5};
        int expectedOutput3 = 5;
        int actualOutput3 = findLargestElement(arr3);
        System.out.println("Test case 3: " + (actualOutput3 == expectedOutput3 ? "PASS" : "FAIL"));

        // Test case 4: empty array
        int[] arr4 = {};
        int expectedOutput4 = Integer.MIN_VALUE; // no largest element found
        int actualOutput4 = findLargestElement(arr4);
        System.out.println("Test case 4: " + (actualOutput4 == expectedOutput4 ? "PASS" : "FAIL"));
    }

    public static int findLargestElement(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE; // no largest element found
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    }
