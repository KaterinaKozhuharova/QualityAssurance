import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num= scanner.nextInt();

        if (num % 2==0) {
            System.out.print("Entered number is even.");
        }
        else {
            System.out.print("Entered number is odd.");
        }
     }

}


