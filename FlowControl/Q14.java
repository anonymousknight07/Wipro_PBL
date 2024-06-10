// Write a program to print the sum of all the digits of a given number.

// Example1) 
// I/P:1234
// O/P:10

public class Q14 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]); 
        
        
        int sum = calculateDigitSum(number);
        
       
        System.out.println("The sum of digits of " + number + " is: " + sum);
    }

   
    public static int calculateDigitSum(int number) {
        int sum = 0;

      
        while (number > 0) {
          
            int digit = number % 10;
            
            sum += digit;
          
            number /= 10;
        }

        return sum;
    }
}
