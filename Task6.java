//Напишете програма, която отпечатва сумата на първите N члена от редицата на Фибоначи.
// Числата на Фибоначи започват от 0 и 1, като всяко следващо се получава като сума от предходните две.

public class Task6 {

    public static void main(String[] args) {

        long n=100;
        long num1=0;
        long num2=1;
        long sum=0;


        for (int i=0;i<n;i++) {
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.println(sum);
        }
    }
}
