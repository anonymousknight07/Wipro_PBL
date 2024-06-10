// Write a program to remove the duplicate elements in an array and print the same.
// Example)
// I/P:{12,34,12,45,67,89}
// O/P:{12,34,45,67,89}

import java.util.Scanner;
import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        int[] uniqueNumbers = removeDuplicates(numbers);
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < uniqueNumbers.length; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArray = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = arr[i];
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }
}

