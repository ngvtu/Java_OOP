package b8;
import java.util.Scanner;
import java.io.*;
public class B8 {

    public static void main(String[] args) {
       int n;
       float tong = 0;
       Scanner ip = new Scanner(System.in);
        System.out.print("Mời bạn nhập số n ");
        System.out.print("\nn = ");
        n=ip.nextInt();
        for(int i=1;i<=n;i++)
        {
            float x = 1;
            for(int j=1;j<=i;j++)
            {
                x =x*j;
            }
            tong += i/x;      
        }
        System.out.println("Tổng S cần tìm = " +tong);
    }
    
}
