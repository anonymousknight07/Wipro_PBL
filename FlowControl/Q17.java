// Write a Java program to find if the given number is palindrome or not

// Example1)
// C:\&gt;java Sample 110011
// O/P: 110011 is a palindrome

// Example2)
// C:\&gt;java Sample 1234
// O/P: 1234 is not a palindrome

public class Q17 {
    public static void main(String[] args) {
        String input = args[0];
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
           
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
