package b9;
import java.util.Scanner;
import java.io.*;
public class B9 {

    public static void main(String[] args) {
        int F0=1,F1=1,F2=0,n;
        Scanner ip = new Scanner(System.in);
        System.out.print("\nn = ");
        n=ip.nextInt();
        for(int i=2;i<n;i++)
        {
            F2=F0+F1;
            F0=F1;
            F1=F2;
        }
        System.out.println("Số Fibonaci thứ n = " +F2);
    }
    
}
