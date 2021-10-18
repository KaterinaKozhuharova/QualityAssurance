// Напишете програма калкулатор, която има следните опции: събиране,изваждане,умножение,деление на две числа или изход.
// Потребителя въвежда числа и избира операция за изпълнение докато не избере изход.

import java.util.Scanner;

public class QA_ex10 {

    public static void main(String[] args) {
        String operation;
        double result = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose an operation (+,-,*,/,Esc:");
            operation = scanner.next();

            if (operation.equals("Esc")) {
                break;
            }
            System.out.println("Please enter the first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Please enter the second number:");
            double num2 = scanner.nextDouble();

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    if (operation!="+" && operation!="-"&& operation!="*"&& operation!="/"&&operation!="Esc"){
                        System.out.println("Please enter a valid operator:");
                    }
                    break;
            }
            System.out.println("The result is: " + result);
        } while (!operation.equals("Esc"));
    }
}
