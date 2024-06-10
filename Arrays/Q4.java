// Initialize an integer array with ascii values and print the corresponding character values in a single row.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] asciiValues = new int[size];
        System.out.println("Enter the ASCII values:");
        for (int i = 0; i < size; i++) {
            asciiValues[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println("Corresponding characters:");
        for (int ascii : asciiValues) {
            System.out.print((char) ascii + " ");
        }
    }
}

