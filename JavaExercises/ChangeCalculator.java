import java.util.Scanner;

class ChangeCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter coffee price:$");
        double coffeePrice = keyboard.nextDouble();

        System.out.print("Enter a given amount:$");
        double amount = keyboard.nextDouble();

        double change = (amount - coffeePrice);
        System.out.printf("Change:$%.2f\n", change);

        int changeInt = ((int) (change * 100));

        int oneCent = 1;
        int twoCent = 2;
        int nickels = 5;
        int dime = 10;
        int half = 50;
        int dollar = 100;

        if (changeInt >= dollar) {
           int numberOfDollars = changeInt / dollar;
            changeInt = changeInt - (numberOfDollars * dollar);
            System.out.println("How many dollars: " +numberOfDollars);

        }

        if (changeInt >= half) {
          int  numberOfHalf = changeInt / half;
            changeInt = changeInt - (numberOfHalf * half);
            System.out.println("How many 50 cents: " +numberOfHalf);

        }

        if (changeInt >= dime) {
           int numberOfDime = changeInt / dime;
            changeInt = changeInt - (numberOfDime * dime);
            System.out.println("How many 10 cents: "+numberOfDime);

        }

        if (changeInt >= nickels) {
          int  numberOfNickels = changeInt / nickels;
            changeInt = changeInt - (numberOfNickels * nickels);
            System.out.println("How many 5 cents: "+numberOfNickels);

        }

        if (changeInt >= twoCent) {
          int  numberOfTwoCent = changeInt / twoCent;
            changeInt = changeInt - (numberOfTwoCent * twoCent);
            System.out.println("How many 2 cents: "+numberOfTwoCent);

        }

        if (changeInt >= oneCent) {
          int  numberOfOneCent = changeInt / oneCent;
            changeInt = changeInt - (numberOfOneCent * oneCent);
            System.out.print("How many 1 cents: "+numberOfOneCent);

        }
    }
}