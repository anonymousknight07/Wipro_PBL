// Write a program to print prime numbers between 10 and 99.

public class Q13 {
    public static void main(String[] args) {
        for (int number = 10; number <= 99; number++) {
            
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }
}