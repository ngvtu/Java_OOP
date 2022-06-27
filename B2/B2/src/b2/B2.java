package b2;

import java.util.Scanner;
import java.io.*;

public class B2 {

    public void KTU(int n) {
        System.out.println("Ước của số cần tìm là: ");
        for(int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                System.out.print("\t"+i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int n;
        System.out.println("Mời bạn nhập số nguyên: ");
        n = ip.nextInt();
        B2 b2 = new B2();
        b2.KTU(n);
        
    }

}
