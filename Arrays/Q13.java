// Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

// Example1)
// C:\&gt;java Sample 1 2 3
// O/P: Please enter 4 integer numbers

// Example2)
// C:\&gt;java Sample 1 2 3 4
// O/P: 
//  The given array is :
//   1 2 
//   3 4 
//  The reverse of the array is :
//   4 3 
//   2 1

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers.");
            return;
        }

        int[][] array = new int[2][2];
        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = Integer.parseInt(args[index]);
                index++;
            }
        }

        System.out.println("The given array is:");
        printArray(array);

        System.out.println("The reverse of the array is:");
        reverseArray(array);
        printArray(array);
    }
    public static void reverseArray(int[][] arr) {
        int temp = arr[0][0];
        arr[0][0] = arr[1][1];
        arr[1][1] = temp;

        temp = arr[0][1];
        arr[0][1] = arr[1][0];
        arr[1][0] = temp;
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
