//Напишете програма, която приема масив от числа и изчислява сумата на всички четни
// и нечетни числа от поредицата изписвайки подходящо съобщение с резултата.
public class Task3 {
    public static void main(String[] args) {
        int[] numArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int sum2=0;

        System.out.println("The sum of the even numbers is:");

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                sum = sum + numArr[i];
            }
        }
        System.out.println(sum);
        System.out.println("The sum of the odd numbers is:");

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 != 0) {
                sum2 = sum2 + numArr[i];
            }
        }
        System.out.println(sum2);
    }
}




