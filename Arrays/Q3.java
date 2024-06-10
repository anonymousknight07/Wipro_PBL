// Write a program to initialize an integer array with values and check if a given number is present in the array or not.
// If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
// Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.
// Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        scanner.close();
        int index = search(numbers, searchElement);
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Index of " + searchElement + " in the array: " + index);
        }
    }
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
