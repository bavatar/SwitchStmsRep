// Write a program using a switch statement to print the month names given the exact number of dayI
// In the month. If the user enters 30 then the program will display: "September April June November".
// If the user enters 9 then program will alert the user that no months have exactly 9 days.
import java.util.Scanner;
public class Main {
    public static void main( String[] args ) {
        int noMonth;            // number of selected month
        int noDaysSelMonth;     // number of days in selected month
        int daysMonth;          // used to find months with this specified number of days
        String nameMonth;       // name of selected month

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter Number of Month : ");
        noMonth = keybd.nextInt();

        System.out.println("Enter No of Days in a Month : ");
        daysMonth = keybd.nextInt();

        noDaysSelMonth = GetDaysInMonth(noMonth);
        nameMonth = GetMonthName(noMonth);

        // Show the number of days in the selected month
         System.out.println("Month: " + nameMonth + "  has " + noDaysSelMonth + " days");

        // Show the months which have the specified number of days
        String tmpStr = GetMonthsWithNoDays(daysMonth);
        if (!tmpStr.equals("")) {
            System.out.println(" Months: " + tmpStr + " have " + daysMonth + " days");
        }
    }

    public static String GetMonthName(int nMonth){
        switch (nMonth){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Error";
        }
    }

    public static String GetMonthsWithNoDays(int days){
        String months = "";
        int month = 0;
        String mName = "";

        for (int i = 1; i<= 12; i++){
            month = GetDaysInMonth(i);
            if (month == days)
            {
                if (months.equals("")){
                    months = GetMonthName(i);
                }
                else {
                    months = months + ", " + GetMonthName(i);
                }
            }
        }
        if (months.equals("")){
            System.out.println("ERROR: No months have exactly: " + days);
        }
        return months;
    }

    public static int GetDaysInMonth(int month){
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                  return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:{
                return 28;
            }
            default: {
                // Error
                return 0;
            }
        }
    }


}
