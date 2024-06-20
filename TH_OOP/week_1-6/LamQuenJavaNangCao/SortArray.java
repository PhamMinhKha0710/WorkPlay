import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Lớp chính phải đặt public class Main
public class SortArray {
    public static void main(String[] args) 
    { 
        //Đọc đầu vào từ Scanner();
        Scanner sc = new Scanner(System.in);  
        //Tiếp tục hoàn thiện mã nguồn
        int a[], n=0;
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       
        for (int i = 0; i < n; i++) {
            for(int j = 0;j<n;j++) {
                if(a[i]<a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                for(int j = 0;j<n;j++) {
                    if(a[i]>a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
        sc.close();
        }
        
}
