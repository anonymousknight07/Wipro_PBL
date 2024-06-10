// Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
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
        Arrays.sort(numbers);
        System.out.println("Smallest 2 numbers:");
        for (int i = 0; i < 2; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nLargest 2 numbers:");
        for (int i = numbers.length - 1; i >= numbers.length - 2; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
