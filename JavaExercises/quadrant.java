import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        double a;                          //x=-b±√b²−4ac//
        double b;                          //  ————————//
        double c;                          //     2a   //

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        a= scanner.nextDouble();

        System.out.print("Enter b:");
        b=scanner.nextDouble();

        System.out.print("Enter c:");
        c= scanner.nextDouble();

        double answer1;
        answer1=Math.sqrt((b*b)-4*a*c);
        answer1= -b+answer1;
        answer1=answer1/(2*a);
        System.out.println("x1="+answer1);

        double answer2;
        answer2=Math.sqrt((b*b)-4*a*c);
        answer2= -b-answer2;
        answer2=answer2/(2*a);
        System.out.println("x2="+answer2);
    }

}



