// Write a program to reverse a given number and print

// Example1)
// I/P: 1234
// O/P:4321

// Example2)
// I/P:1004
// O/P:4001

public class Q16 {
    public static void main(String[] args) {
        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid number.");
            return;
        }
        int reversedNumber = reverseNumber(number);
        System.out.println("The reversed number is: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }
        return reversedNumber;
    }
}
