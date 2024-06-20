import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements in the array
        int n = sc.nextInt();
        
        // Allocate memory for the array
        int[] a = new int[n];
        
        // Read values for each element in the array
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        // Find the maximum value in the array
        int max = a[0];
        for(int i = 1; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        
        // Output the maximum value
        System.out.println(max);
        
        // Close the scanner
        sc.close();
    }
}
