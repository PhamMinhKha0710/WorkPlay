package LamQuenVoiJava;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class MartixCalu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int c = sc.nextInt();
        
        if (d <= 0 || d > 100 || c <= 0 || c > 100) {
            System.out.println("Invalid dimensions");
            return;
        }

        int[][] matrix = new int[d][c];
        int sum = 0;
        int positiveSum = 0;
        int positiveCount = 0;

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
                if (matrix[i][j] > 0) {
                    positiveSum += matrix[i][j];
                    positiveCount++;
                }
            }
        }

        double average = (double) sum / (d * c);
        double positiveAverage = positiveCount > 0 ? (double) positiveSum / positiveCount : 0.0;

        System.out.println(sum);
        System.out.println(String.format("%.2f", average));
        System.out.println(String.format("%.2f", positiveAverage));
    }
}
