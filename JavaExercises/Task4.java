//Напишете програма, която отпечатва на конзолата числата от 1 до N. Числото N се приема като параметър.

import java.util.Scanner;
public class Task4 {
    public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n=scanner.nextInt();
        int one=1;

        for(one=1;one<=n;one++){
        System.out.println(one);
        }
    }
}
