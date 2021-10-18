import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse:");

        int digit = scanner.nextInt();
        System.out.print(digit % 10);
        digit = digit / 10;
        System.out.print(digit % 10);
        digit = digit / 10;
        System.out.print(digit % 10);
    }
}






