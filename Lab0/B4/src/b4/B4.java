package b4;
import java.util.Scanner;
import java.io.*;

public class B4 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner ip = new Scanner(System.in);
        System.out.println("Mời bạn nhập hệ số a, b, c của phương trình");
        System.out.print("\n a = ");
        a = ip.nextFloat();
        System.out.print("\n b = ");
        b = ip.nextFloat();
        System.out.print("\n c = ");
        c = ip.nextFloat();
        if(a==0)
        {
            System.out.println("Đây là phương trình bậc nhất");
            if (b==0)
            {
                if (c==0)
                {
                    System.out.println("Phương trình có vô số nghiệm");
                }
                else
                {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            else
            {
                System.out.print("\nPhương trình có nghiệm x = "+(-c/b));
            }
        }
        else
        {
            System.out.println("Đây là phương trình bậc 2");
            float delta,x,y;
            delta = b*b-4*a*c;
            if(delta>0)
            {
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                System.out.print("\nx = "+(-b-Math.sqrt(delta))/(2*a));
                System.out.print("\ny = "+(-b+Math.sqrt(delta))/(2*a));
                System.out.println();
            }
            if(delta==0)
            {
                System.out.println("Phương trình có nghiệm kép");
                System.out.print("\n x = "+(-b/(2*a)));
                System.out.println();
            }
            if(delta<0)
            {
                System.out.println("Phương trình có nghiệm phức");
                System.out.print("\nx = "+(-b/(2*a)) + "-" +(Math.sqrt(-delta))/(2*a) +"i");
                System.out.print("\nx = "+(-b/(2*a)) + "+" +(Math.sqrt(-delta))/(2*a) +"i");
            }
        }
    }
    
}
