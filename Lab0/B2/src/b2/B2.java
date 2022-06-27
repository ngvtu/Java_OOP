package b2;
import java.util.Scanner;
import java.io.*;
public class B2 {
    Scanner ip = new Scanner(System.in);
    public void Tong1()
    {
        int tong = 0;
        for(int i=0;i<10;i++)
        {
            tong += i;
        }
        System.out.println("Tổng của 10 số đầu tiên = " +tong);
    }
    public void Tong2()
    {
        int tong = 0;
        for(int i=0;i<10;i++)
        {
            tong += i*2;
        }
        System.out.println("Tổng của 10 số chẵn đầu tiên = " +tong);
    }
    public static void main(String[] args) {
        B2 x = new B2();
        x.Tong1();
        x.Tong2();
    }
    
}
