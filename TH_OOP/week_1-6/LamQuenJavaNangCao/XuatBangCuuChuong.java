import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Lớp chính phải đặt public class Main
public class XuatBangCuuChuong {
    public static void main(String[] args) {
        //Đọc đầu vào từ Scanner();
        Scanner sc = new Scanner(System.in);  
        //Tiếp tục hoàn thiện mã nguồn
        int s=sc.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.println(s+"*"+i+"="+s*i);
        }
        
    }
}