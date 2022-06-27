package b11;

import java.util.Scanner;
import java.io.*;

public class B11 {

    public void KTNT(int n) {
        int i, dem = 0;
        if (n < 2) {
            System.out.println(+n + " không phải là số nguyên tố");
        } else if (n == 2) {
            System.out.println(+n + " là số nguyên tố");
        } else if (n % 2 == 0) {
            System.out.println(+n + " không phải là số nguyên tố");
        } else {
            for (i = 3; i <= n / 2; i += 2) {
                if (n % i == 0) {
                    dem++;
                }
            }

            if (dem != 0) {
                System.out.println(+n + " không phải là số nguyên tố");
            } else {
                System.out.println(+n + " là số nguyên tố");
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner ip = new Scanner(System.in);
        B11 x = new B11();
        System.out.print("\nn = ");
        n = ip.nextInt();
        x.KTNT(n);
    }

}
