package b7;
import java.util.Scanner;
import java.io.*;
public class B7 {
    public static void main(String[] args) {
        int n;
        float tich=1;
        Scanner ip = new Scanner(System.in);
        System.out.println("Mời bạn nhập số n");
        System.out.print("\nn = ");
        n = ip.nextInt();
        for(int i=1;i<=n;i++)
        {
            tich*=i;
        }
        System.out.println("Giai thừa của " +n+ " = "+tich);
    }
    
}
