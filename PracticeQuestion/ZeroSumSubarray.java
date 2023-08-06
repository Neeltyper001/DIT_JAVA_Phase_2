package PracticeQuestion;

import java.util.HashSet;
import java.util.Scanner;

class ZeroSumSubarray {
    public static boolean hasZeroSumSubarray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum is zero or it exists in the set, subarray with zero sum exists
            if (sum == 0 || set.contains(sum)) {
                return true;
            }

            // Add sum to the set
            set.add(sum);
        }

        // No subarray with zero sum found
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        if (hasZeroSumSubarray(arr)) {
            System.out.println("Subarray with zero sum exists.");
        } else {
            System.out.println("Subarray with zero sum does not exist.");
        }
    }
}
