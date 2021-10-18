//Напишете програма, която сумира естествените числа от N до M. Ако потребителя е въвел M<N го накарайте да въвежда
//отново докато не въведе коректна стойност за M.

import java.util.Scanner;
public class QA_ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for N:");
        int n = scanner.nextInt();
        System.out.println("Please enter a number for M:");
        int m = scanner.nextInt();
        int sum = 0;

        while (m < n) {
            System.out.println("M must be greater than N. Please enter a number for M:");
            m = scanner.nextInt();
        }

        for (int i = n; i <= m; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the numbers is: " +sum);
    }
}











