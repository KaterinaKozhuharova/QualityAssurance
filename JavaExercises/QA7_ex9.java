//Напишете програма, която пресмята степен без функцията Math pow()

import java.util.Scanner;
public class QA7_ex9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number= scanner.nextInt();
        System.out.println("Please enter a exponent:");
        int exponent=scanner.nextInt();
        int result=1;

        while (exponent!=0) {
            result=result*number;
            --exponent;
        }
        System.out.println("The result is: "+result);
    }

}
