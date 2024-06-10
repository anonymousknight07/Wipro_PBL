// Write a program to receive a color code from the user (an Alphabhet). 

// The program should then print the color name, based on the color code given. 

// The following are the color codes and their corresponding color names.
// R-&gt;Red, B-&gt;Blue, G-&gt;Green, O-&gt;Orange, Y-&gt;Yellow, W-&gt;White. 

// If color code provided by the user is not valid then print "Invalid Code". 
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       
        // Prompt the user to enter a color code
        System.out.println("Enter a color code (R, B, G, O, Y, W): ");
        char colorCode = scanner.next().charAt(0);

        
        colorCode = Character.toUpperCase(colorCode);

        
        switch (colorCode) {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
                break;
        }

        scanner.close();
    }
}
