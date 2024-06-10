// Write a program to receive a number and print the corresponding month name.


public class Q9 {
    public static void main(String[] args) {
        int monthNumber;
        try {
            monthNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid month");
            return;
        }

        
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month");
            return;
        }

        
        String monthName;
        switch (monthNumber) {
            case 1:  monthName = "January"; break;
            case 2:  monthName = "February"; break;
            case 3:  monthName = "March"; break;
            case 4:  monthName = "April"; break;
            case 5:  monthName = "May"; break;
            case 6:  monthName = "June"; break;
            case 7:  monthName = "July"; break;
            case 8:  monthName = "August"; break;
            case 9:  monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Invalid month"; break;
        }

        System.out.println(monthName);
    }
}
