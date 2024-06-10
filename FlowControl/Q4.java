// Initialize two character variables in a program and display the characters in alphabetical order.

// Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

// Example2) if the first character is 'a' and second character is 'e', then the output should be a,e

public class Q4 {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Enter two chars");
            return;
        }
        char a=args[0].charAt(0);
        char b=args[1].charAt(0);

        if(a<b){
            System.out.println(a+","+b);
        }
        else{
            System.out.println(b+","+a);
        }

    }
}
