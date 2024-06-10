// Write a program to print the sum of the elements of an array following the given below condition.
// If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
// Eg1) Array Elements - 10,3,6,1,2,7,9
// O/P: 22   
// [i.e 10+3+9]
// Eg2) Array Elements - 7,1,2,3,6
// O/P:19
// Eg3) Array Elements - 1,6,4,7,9
// O/P:10
import java.util.Scanner;

public class Q8 {
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
        System.out.println("Sum of the elements following the condition: " + sum);
    }
    public static int calculateSum(int[] arr) {
        int sum = 0;
        boolean between67 = false;
        for (int num : arr) {
            if (num == 6) {
                between67 = true;
            } else if (num == 7 && between67) {
                between67 = false;
            } else if (!between67) {
                sum += num;
            }
        }
        return sum;
    }
}
