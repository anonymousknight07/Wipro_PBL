// Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.
// Example1:
// C:\&gt;java Sample 1 2 3
// O/P: Please enter 9 integer numbers
// Example2:
// C:\&gt;java Sample 1 23 45 55 121 222 56 77 89
// O/P: 
// The given array is :
// 1 23 45 
// 55 121 222 
// 56 77 89 
// The biggest number in the given array is 222

import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers.");
            return;
        }
        int[][] array = new int[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(args[index]);
                index++;
            }
        }
        System.out.println("The given array is:");
        printArray(array);
        int maxNumber = findMax(array);
        System.out.println("The biggest number in the given array is " + maxNumber);
    }
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
