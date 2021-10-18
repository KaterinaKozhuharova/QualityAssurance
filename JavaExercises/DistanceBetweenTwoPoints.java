import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {

        double x1;
        double x2;
        double y1;
        double y2;
        double distance;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 point:");
        x1 = scanner.nextDouble();

        System.out.print("Enter y1 point:");
        y1 = scanner.nextDouble();

        System.out.print("Enter x2 point:");
        x2 = scanner.nextDouble();

        System.out.print("Enter y2 point:");
        y2 = scanner.nextDouble();

        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.print("The distance is: " + distance);
    }

}

