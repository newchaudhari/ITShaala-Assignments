package interview;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int totalSum = n * (n + 2) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }
        int missingNumber = totalSum - arraySum;
        System.out.println(missingNumber);

    }
}
