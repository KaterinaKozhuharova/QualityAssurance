// Напишете програма, която извежда елементите в два диагонала на матрица (двумерен масив).

import java.util.Scanner;

public class QA7_ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3;

        int a[][] = new int[n][n];
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Right diagonal elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1)
                    System.out.println(a[i][j] + " ");
            }
        }
        System.out.println("Left diagonal elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    System.out.println(a[i][j] + " ");
            }
        }
    }
}

