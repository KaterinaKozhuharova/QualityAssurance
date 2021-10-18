// В числов масив проверете колко пъти се съдържа числото, което потребителя търси. Ако има такова проверете
// на коя позиция се среща за първи път и на коя за последен. Да се направи в символен низ.

import java.util.Scanner;
public class QA7_ex12 {

    public static void main(String args[]) {

        String arr[] = new String[]{"a","b","c","a","d"};
        int n = arr.length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a letter:");
        String target = scanner.next();
        result(arr,n,target);
        System.out.println(n);

    }
    public static void result(String arr[], int n, String target) {
        int first=-1;
        int last=-1;

        for (int i =0; i < n; i++) {
            if (arr[i].equals(target)) {
                first = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i].equals(target)) {
                last = i;
                break;
            }
        }
        System.out.println(" The first position of " + target + " at index : " + first + " and the last position is at index : " + last);
    }

}

