// Initialize a character variable in a program and 

// print 'Alphabhet' if the initialized value is an alphabhet, 

// print 'Digit' if the initialized value is a number, and 

// print 'Special Character', if the initialized value is anything else.

public class Q5 {
    public static void main(String[] args) {
        char ch = args[0].charAt(0); 
       
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        }
        
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        
        else {
            System.out.println("Special Character");
        }
  
    }
}
