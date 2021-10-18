// Намерете най-дългата строго растяща поредица в числов масив.

import java.util.ArrayList;

public class QA_ex13 {
    public static void main(String[] args) {
        int[] array = {41, 50, 52, 53, 54, 55, 59, 65, 90,1,6,1,2,3,4,5,6,28,72};

        ArrayList<Integer> longestArr = new ArrayList<Integer>();
        ArrayList<Integer> myArr = new ArrayList<Integer>();

        for (int i = 1; i < array.length; i++) {
            if (myArr.isEmpty()) {
                myArr.add(array[i - 1]);
            }
            if (array[i] > array[i - 1]) {
                myArr.add(array[i]);
            } else {
                if (longestArr.size() < myArr.size()) {
                    longestArr.clear();
                    longestArr.addAll(myArr);
                }
                myArr.clear();
            }
        }
        System.out.println(longestArr);
    }
}