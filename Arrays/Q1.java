// Write a program to initialize an integer array and print the sum and average of the array.
import java.util.Scanner;
public class Q1{
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
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
    }
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static double calculateAverage(int[] arr) {
        double sum = calculateSum(arr);
        return sum / arr.length;
    }
}