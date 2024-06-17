import java.util.Scanner;
import java.util.StringTokenizer;

public class CauDaoNguoc {

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHap mot chuoi: ");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        String s2 = "";
        while (st.hasMoreTokens()) {
            s2 = st.nextToken() + " " + s2;
        s2 = s2.trim();
        System.out.println("ket qua : " + s2);
        sc.close();
            
        }
    }
}