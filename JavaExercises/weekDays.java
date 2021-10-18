import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class weekDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int input = scanner.nextInt();

        String day;
        switch (input) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "No such day";
                break;
        }

        System.out.println("You entered: " + input);
        System.out.print("So week day is: " + day);
    }
}


