package b10;
import java.util.Scanner;
import java.io.*;
public class B10 {

    public static void main(String[] args) {
        int n,tong = 0;
        Scanner ip = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên ");
        System.out.print("\nn = ");
        n = ip.nextInt();
        int m=n;
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        System.out.println("Tổng các chữ số của " +m+ " = " +tong);
    }

}
