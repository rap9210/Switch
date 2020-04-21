import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int days_in_month;
        System.out.println("Enter the number of days to find out \nwhich months have that many: ");
        days_in_month = scn.nextInt();
        String month;
        switch (days_in_month){
            case 28:    month = "February";
                        break;
            case 29:    month = "February (only during leap year";
                        break;
            case 30:    month = "April, June, September, November";
                        break;
            case 31:    month = "January, March, May, July, August, \nOctober, December";
                        break;
            default:    month = "There are no months with exactly "+days_in_month+" days.";
                        break;
        }
        System.out.println(month);
    }
}
