package lab1.pkg1;
import java.util.Scanner;
import java.io.*;
public class Lab11 {
Scanner ip = new Scanner(System.in);
    public void Timuoc()
    {
        int a,b,u=0;  
        System.out.print("Mời bạn nhập số a:  ");
        a = ip.nextInt();
        System.out.println();
        System.out.print("Mời bạn nhập số b:  ");
        b = ip.nextInt();
        for(int i=1; i<=a && i<=b;i++)
        {
            if (a%i==0 && b%i ==0)
            {
                u = i;
            }
        }
        System.out.println("Ước số chung lớn nhất của 2 số a và b là " +u);
    }
    public void Fibonaci(int n)
    {
        int a = 0,a0=0,a1=1;
                for(int i=1; i<n;i++)
                {
                    a=a0+a1;
                    a0=a1;
                    a1=a;
                }
           System.out.println("Số fibonaci thứ " + n + " là " +a );
    }
    public static void main(String[] args) {
        int n;
        Scanner ip = new Scanner(System.in);
        Lab11 a = new Lab11();
        a.Timuoc();
        System.out.println("Mời bạn nhập vị trí số fibonaci");
        n = ip.nextInt();
        a.Fibonaci(n);
        
    }
    
}
