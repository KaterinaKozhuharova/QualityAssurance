//Напишете програма, която извежда N. Ако потребителя въведе N:5. Да се изведе като резултат 5.4.3.2.1=120.
import java.util.Scanner;
public class QA7_ex8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n= scanner.nextInt();
        int fact=n;
        System.out.print(n);

        for (int i=n-1;i>0;i--) {
            fact = fact * i;
   //         System.out.println(fact);
            System.out.print("*"+ i);
        }
        System.out.println("=" + fact);
    }
}
