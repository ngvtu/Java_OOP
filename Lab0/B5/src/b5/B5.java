package b5;
import java.util.Scanner;
import java.io.*;
public class B5 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n,tong=0;
        System.out.print("Mời bạn nhập số n");
        System.out.print("\n n = ");
        n = ip.nextInt();
        for(int i=1;i<=n;i++)
        {
            tong +=i;
        }
        System.out.println("Tổng từ 1 đến " +n+ " = " +tong);
    }
    
}
