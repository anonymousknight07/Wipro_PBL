// Initialize a character variable with an alphabhet in a program.

// If the character value is in lowercase, the output should be displayed in uppercase in the following format.

// Example1)
// i/p:a
// o/p:a-&gt;A

// If the character value is in uppercase, the output should be displayed in lowercase in the following format.

// Example2)
// i/p:A
// o/p:A-&gt;a

public class Q7 {
    public static void main(String[] args){
        char ch = args[0].charAt(0);

      
        if (ch >= 'a' && ch <= 'z') {
            char upperCaseChar = Character.toUpperCase(ch);
            System.out.println(ch + "->" + upperCaseChar);
        }
        
        else if (ch >= 'A' && ch <= 'Z') {
            char lowerCaseChar = Character.toLowerCase(ch);
            System.out.println(ch + "->" + lowerCaseChar);
        }
        
        else {
            System.out.println("The character is not an alphabet.");
        }

    }
}
