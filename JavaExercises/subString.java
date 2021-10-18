import java.util.Scanner;

import java.util.Scanner;
public class subString {

    public static void main(String[] args) {

        String original="Month of birth:February.";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a month of birth:");
        String replaced= original.replace("February", scanner.next());
        System.out.print(replaced);

    }
}

