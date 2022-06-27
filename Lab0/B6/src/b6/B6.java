package b6;
import java.util.Scanner;
import java.io.*;
public class B6 {
    public static void main(String[] args) {
        int n;
        float tong=0;
        Scanner ip = new Scanner(System.in);
        System.out.println("Mời bạn nhập số n");
        System.out.print("\nn = ");
        n = ip.nextInt();
        for(int i=1;i<=n;i++)
        {
            tong+=1.0/i;
        }
        System.out.println("Tổng cần tìm = "+tong);
    }
    
}
