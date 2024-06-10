// Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.
// withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
// withoutTen([10, 2, 10]) → [2, 0, 0]
// withoutTen([1, 99, 10]) → [1, 99, 0]


import java.util.Scanner;

public class Q9 {
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
        int[] result = withoutTen(numbers);
        System.out.print("Array after removing 10s: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num != 10) {
                result[index++] = num;
            }
        }
        return result;
    }
}

