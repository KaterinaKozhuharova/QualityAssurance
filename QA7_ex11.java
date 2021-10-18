// В числов масив проверете колко пъти се съдържа числото, което потребителя търси. Ако има такова проверете
// на коя позиция се среща за първи път и на коя за последен.

import java.util.Scanner;

public class QA7_ex11 {

    public static void main(String args[]) {

        int arr[] = new int[]{8, 2, 6, 3, 9, 6, 10};
        int n = arr.length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int target = scanner.nextInt();
        result(arr,n, target);
        System.out.println(n);
    }

    public static void result(int arr[], int n, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                first = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                last = i;
                break;
            }
        }
        System.out.println(" The first position of " + target + " at index : " + first + " and the last position is at index : " + last);
    }
}