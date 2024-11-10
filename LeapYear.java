//WRITE A PROGRAM TO CHECK WHETHER A GIVEN YEAR IS LEAP OR NOT
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("The year " + year + " is a leap year");
        }
        else{
            System.out.println("The year " + year + " is not a leap year");
        }
        sc.close();
    }
}
