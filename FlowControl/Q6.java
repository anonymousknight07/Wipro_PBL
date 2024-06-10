// Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

// If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

// If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

// If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

// If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.

public class Q6 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Provide two args");
            return;
        }

        
        String gender = args[0];
        int age;

        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid age.");
            return;
        }

        
        if (age < 1 || age > 100) {
            System.out.println("Age should be between 1 and 100.");
            return;
        }

        
        double interestRate;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.2;
            } else if (age >= 59 && age <= 100) {
                interestRate = 9.2;
            } else {
                System.out.println("Invalid age.");
                return;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.4;
            } else if (age >= 59 && age <= 100) {
                interestRate = 10.5;
            } else {
                System.out.println("Invalid age.");
                return;
            }
        } else {
            System.out.println("Invalid gender. Please enter 'Male' or 'Female'.");
            return;
        }

        // Print the percentage of interest
        System.out.println("The percentage of interest is: " + interestRate + "%");
    
    }
}
