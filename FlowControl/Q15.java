// Write a program to print * in Floyds format (using for and while loop)
// *
// *  *
// *  *   *

// Example1)
// C:\>java Sample 
// O/P: Please enter an integer number

// Example2)
// C:\>java Sample 3
// O/P :
// *
// *  * 
// *  *  *
public class Q15 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter an integer number.");
            return;
        }

        int rows;
        try {
           
            rows = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer number.");
            return;
        }

        
        System.out.println("Using for loop:");
        printFloydTriangleFor(rows);

        
        System.out.println("\nUsing while loop:");
        printFloydTriangleWhile(rows);
    }

   
    public static void printFloydTriangleFor(int rows) {
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                number++;
            }
            System.out.println();
        }
    }

    
    public static void printFloydTriangleWhile(int rows) {
        int i = 1;
        int number = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                number++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

