//Напишете програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7.

public class Task5 {
    public static void main(String[] args) {
        int n = 10;
        int one = 1;

        for (one = 1; one <= n; one++) {
            if (one % 3 != 0 && one % 7 != 0) {
                System.out.println(one);
            }
        }
    }
}


